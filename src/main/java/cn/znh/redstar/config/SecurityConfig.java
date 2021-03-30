package cn.znh.redstar.config;

import cn.znh.redstar.common.utils.JwtTokenUtil;
import cn.znh.redstar.component.*;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.service.DynamicSecurityService;
import cn.znh.redstar.service.UmsAdminService;
import cn.znh.redstar.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : znh
 * @date : 23:03 2021/3/17
 * springSecurity配置
 * 只有加了@EnableGlobalMethodSecurity(prePostEnabled=true)
 * 那么在上面使用的 @PreAuthorize(“hasAuthority(‘admin’)”)才会生效
 */
@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Resource
    private UmsAdminService umsAdminService;
    @Resource
    private UmsResourceService umsResourceService;
    @Autowired(required = false)
    private DynamicSecurityService dynamicSecurityService;
    /**
     * 用于配置需要拦截的url路径、jwt过滤器及出异常后的处理器；
     * @param httpSecurity
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry
                =httpSecurity.authorizeRequests();
        //放行白名单资源路径
        for (String url: ignoreUrlsConfig().getIgnoreUrls())
        {
            registry.antMatchers(url).permitAll();
        }
        //放行options请求，跨域
        registry.antMatchers(HttpMethod.OPTIONS).permitAll();
        //测试阶段全部放行
        registry.antMatchers("/**").permitAll();
        //其它任何请求都要身份认证
        registry.and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                //关闭跨站请求防护和不使用session
                .and()
                .csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                //自定义权限拒绝处理类
                .and()
                .exceptionHandling()
                .accessDeniedHandler(restfulAccessDeniedHandler())
                .authenticationEntryPoint(restAuthenticationEntryPoint())
                //自定义权限拦截器jwt过滤器
                .and()
                .addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        //有动态权限配置时添加动态权限校验过滤器
        if (dynamicSecurityService!=null)
        {
            registry.and().addFilterBefore(dynamicSecurityFilter(), FilterSecurityInterceptor.class );
        }
        //让X-frame-options失效,去除iframe限制
        httpSecurity.headers().frameOptions().disable();
    }

    /**
     *用于配置UserDetailsService及PasswordEncoder；
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
    }



    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        return username->umsAdminService.loadUserByUsername(username);
    }

    /**
     * 密码加密形式
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 白名单配置
     * @return
     */
    @Bean
    public IgnoreUrlsConfig ignoreUrlsConfig()
    {
        return new IgnoreUrlsConfig();
    }

    /**
     * 无访问权限时自定义返回结果
     * @return
     */
    @Bean
    public RestfulAccessDeniedHandler restfulAccessDeniedHandler()
    {
        return new RestfulAccessDeniedHandler();
    }

    /**
     * 未登录或登录过期自定义返回结果
     * @return
     */
    @Bean
    public RestAuthenticationEntryPoint restAuthenticationEntryPoint()
    {
        return new RestAuthenticationEntryPoint();
    }

    /**
     * Jwt登录授权过滤器
     * @return
     */
    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter()
    {
        return new JwtAuthenticationTokenFilter();
    }

    /**
     * 动态权限Service
     * @return
     */
    @Bean
    public DynamicSecurityService dynamicSecurityService()
    {
        return new DynamicSecurityService() {
            @Override
            public Map<String, ConfigAttribute> loadDataSource() {
                //ConcurrentHashMap,高并发
                Map<String,ConfigAttribute> map=new ConcurrentHashMap<>();
                //查询全部资源
                List<UmsResource> resourceList = umsResourceService.get();
                for(UmsResource resource:resourceList)
                {
                    //存放资源URL,资源的分类id和名称
                    map.put(resource.getUrl(),new org.springframework.security.access.SecurityConfig
                            (resource.getId()+":"+resource.getName()));
                }
                return map;
            }
        };
    }

    /**
     * spring security 认证管理器
     * @return
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }



    /**
     *动态权限决策管理器，用于判断用户是否有访问权限
     * @return
     */
    @ConditionalOnBean(name = "dynamicSecurityService")
    @Bean
    public DynamicAccessDecisionManager dynamicAccessDecisionManager()
    {
        return new DynamicAccessDecisionManager();
    }

    /**
     * 动态权限过滤器
     * @return
     */
    @ConditionalOnBean(name = "dynamicSecurityService")
    @Bean
    public DynamicSecurityFilter dynamicSecurityFilter()
    {
        return  new DynamicSecurityFilter();
    }

    /**
     * 动态权限数据源，用于获取动态权限规则
     * @return
     */
    @ConditionalOnBean(name = "dynamicSecurityService")
    @Bean
    public DynamicSecurityMetadataSource dynamicSecurityMetadataSource()
    {
        return new DynamicSecurityMetadataSource();
    }
}
