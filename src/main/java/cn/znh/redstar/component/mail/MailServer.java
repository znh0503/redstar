package cn.znh.redstar.component.mail;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : znh
 * @date : 15:44 2021/3/21
 */
@Slf4j
@Component
public class MailServer {
    @Value("${mail.qq.authentication.username}")
    private  String MAIL_QQ_AUTHENTICATION_USERNAME;
    @Value("${mail.qq.authentication.password}")
    private  String MAIL_QQ_AUTHENTICATION_PASSWORD;
    @Value("${mail.qq.name}")
    private  String MAIL_QQ_NAME;

    /**
     * qq邮箱发送接口（文本）
     * @param subject 主题
     * @param message 消息
     * @param addr  收件人地址
     */
    public  int  qqMailSend(String subject,String message,String addr)
    {
        SimpleEmail email = new SimpleEmail();
        try {
            // 发送电子邮件的邮件服务器地址
            email.setHostName("smtp.qq.com");
            // 设置字符编码
            email.setCharset("UTF-8");
            // 邮箱服务器身份验证
            // qq客户端授权码获取方式： https://service.mail.qq.com/cgi-bin/help?subtype=1&&id=28&&no=1001256
            email.setAuthentication(MAIL_QQ_AUTHENTICATION_USERNAME, MAIL_QQ_AUTHENTICATION_PASSWORD);
            // 设置发件人邮箱(与用户名保持一致) 并且 设置发件人昵称
            email.setFrom(MAIL_QQ_AUTHENTICATION_USERNAME,MAIL_QQ_NAME);
            // 邮件主题
            email.setSubject(subject);
            // 邮件内容
            email.setMsg(message);
            // 收件人地址
            email.addTo(addr);
            // 邮件发送
            email.send();
            log.info("邮件发送成功");
            return 1;
        }catch (EmailException e){
            log.error("邮件发送失败了");
            e.printStackTrace();
            return 0;
        }
    }
}
