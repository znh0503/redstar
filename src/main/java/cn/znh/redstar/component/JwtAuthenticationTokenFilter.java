package cn.znh.redstar.component;

import cn.znh.redstar.common.utils.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : znh
 * @date : 2:00 2021/3/20
 * Jwt登录授权过滤器
 */
@Slf4j
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    @Resource
    private UserDetailsService userDetailsService;
    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.claimsHead}")
    private String claimsHead;
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        if (authHeader!=null&&authHeader.startsWith(this.claimsHead))
        {
            //路径在claimsHead（bearer）后面
            String authToken=authHeader.substring(this.claimsHead.length());
            String userNameFromToken = jwtTokenUtil.getUserNameFromToken(authToken);
            log.info("JwtAuthenticationTokenFilter#doFilterInternal username is {}",userNameFromToken);
            if (userNameFromToken!=null&& SecurityContextHolder.getContext().getAuthentication()==null)
            {
                UserDetails userDetails = this.userDetailsService.loadUserByUsername(userNameFromToken);
                if (jwtTokenUtil.verifyToken(authToken,userDetails))
                {
                    UsernamePasswordAuthenticationToken authentication=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                    log.info("JwtAuthenticationTokenFilter#doFilterInternal authenticated user:{}",userNameFromToken);
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
