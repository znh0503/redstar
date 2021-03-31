package cn.znh.redstar.mail;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * @author : znh
 * @date : 15:32 2021/3/21
 */
public class TestCommon_QQ {
    public static void main(String[] args) throws EmailException {
        SimpleEmail email = new SimpleEmail();
        try {
            // 发送电子邮件的邮件服务器地址
            email.setHostName("smtp.qq.com");
            email.setCharset("UTF-8");// 设置字符编码
            // 邮箱服务器身份验证
            // qq客户端授权码获取方式： https://service.mail.qq.com/cgi-bin/help?subtype=1&&id=28&&no=1001256
            email.setAuthentication("604793921@qq.com", "axalpxejckiubegf");
            // 设置发件人邮箱(与用户名保持一致) 并且 设置发件人昵称
            email.setFrom("604793921@qq.com","redstar");
            // 邮件主题
            email.setSubject("测试主题");
            // 邮件内容
            email.setMsg("hi 我是一个测试文本，请忽略！");
            // 收件人地址
            email.addTo("604793921@qq.com");
            // 邮件发送
            email.send();
            System.out.println("邮件发送成功！");
        }catch (EmailException e){
            e.printStackTrace();
            System.err.println("邮件发送失败！");
        }
    }
}
