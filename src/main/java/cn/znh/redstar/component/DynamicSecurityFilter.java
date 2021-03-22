package cn.znh.redstar.component;

import cn.znh.redstar.config.IgnoreUrlsConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author : znh
 * @date : 22:01 2021/3/18
 * 动态权限过滤器，用于实现基于路径的动态权限过滤
 */
@Slf4j
public class DynamicSecurityFilter extends AbstractSecurityInterceptor implements Filter {
    @Resource
    private DynamicSecurityMetadataSource dynamicSecurityMetadataSource;

    @Resource
    private IgnoreUrlsConfig ignoreUrlsConfig;

    @Resource
    public void setMyAccessDecisionManager(DynamicAccessDecisionManager dynamicAccessDecisionManager) {
        super.setAccessDecisionManager(dynamicAccessDecisionManager);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        FilterInvocation invocation=new FilterInvocation(servletRequest,servletResponse,filterChain);
        //放行options请求,跨域
        if (request.getMethod().equals(HttpMethod.OPTIONS.toString()))
        {
            invocation.getChain().doFilter(invocation.getRequest(),invocation.getResponse());
            return;
        }
        //放行白名单路径资源
        PathMatcher pathMatcher=new AntPathMatcher();
        for (String path:ignoreUrlsConfig.getIgnoreUrls())
        {
            if (pathMatcher.match(path,request.getRequestURI()))
            {
                invocation.getChain().doFilter(invocation.getRequest(),invocation.getResponse());
                return;
            }
        }
        //此处会调用AccessDecisionManager中的decide方法进行鉴权操作
        InterceptorStatusToken token = super.beforeInvocation(invocation);
        try {
            invocation.getChain().doFilter(invocation.getRequest(),invocation.getResponse());
        }
        //不能捕获异常，不然进不去自定义返回结果
//        catch (Exception e)
//        {
//            log.error("DynamicSecurityFilter出错了:{}",e);
//        }
        finally {
            super.afterInvocation(token,null);
        }
    }

    @Override
    public void destroy() {

    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return dynamicSecurityMetadataSource;
    }
}
