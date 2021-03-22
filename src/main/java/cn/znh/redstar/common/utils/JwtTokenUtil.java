package cn.znh.redstar.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : znh
 * @date : 23:07 2021/3/17
 * JWTToken的工具类
 */
@Component
@Slf4j
public class JwtTokenUtil {
    private static final String CLAIMS_KEY_USERNAME="sub";
    private static final String CLAIMS_KEY_CREATE="create";
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;

    /**
     * 根据负载生成token
     * @param claims
     * @return
     */
    private String generateToken(Map<String,Object>claims)
    {
        return Jwts.builder()
                .setClaims(claims)
                //设置过期时间
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512,secret)
                .compact();
    }

    /**
     * 根据用户信息生成token
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIMS_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIMS_KEY_CREATE, new Date());
        return generateToken(claims);
    }
    /**
     * 生成token的过期时间
     * @return
     */
    private Date generateExpirationDate()
    {
        return new Date(System.currentTimeMillis()+expiration*1000);
    }

    /**
     * 从token中获取jwt的负载
    * @param token
     * @return
     */
    private Claims getClaimsFromToken(String token)
    {
        Claims claims=null;
        try {
            claims= Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        }
        catch (Exception e)
        {
            log.info("getClaimsFromToken,获取负载失败:{}",token);
            e.printStackTrace();
        }
        return claims;
    }

    /**
     * 从token中获取登录用户名
     * @param token
     * @return
     */
    public String getUserNameFromToken(String token)
    {
        String username;
        try {
            Claims claims=getClaimsFromToken(token);
            username = claims.getSubject();
        }
        catch (Exception e)
        {
            username=null;
        }
        return username;
    }

    /**
     * 验证token是否还有效
     * @param token 客户端传入的token
     * @param userDetails   从数据库中查询出来的用户信息
     * @return
     */
    public boolean verifyToken(String token, UserDetails userDetails)
    {
        String username=getUserNameFromToken(token);
        return username.equals(userDetails.getUsername())&&!isTokenExpired(token);
    }

    /**
     * 判断token是否过期
     * @param token
     * @return  true过期,false没过期
     */
    private boolean isTokenExpired(String token)
    {
        Date expireDate=getExpiredDateFromToken(token);
        return expireDate.before(new Date());
    }

    /**
     * 从token中获取过期时间
     * @param token
     * @return
     */
    private Date getExpiredDateFromToken(String token)
    {
        Claims claims=getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 判断token是否可以刷新
     * @param token
     * @return
     */
    public boolean canRefresh(String token)
    {
        //判断token是否过期
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     * @param token
     * @return
     */
    public String refreshToken(String token)
    {
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIMS_KEY_CREATE,new Date());
        return generateToken(claims);
    }

}
