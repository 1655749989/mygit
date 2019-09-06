package cn.lpl.yz;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;


//邮箱验证
public class YZEmail {
    public void YZM() {

        try {
            HtmlEmail email = new HtmlEmail();
            //要接收的邮箱
            email.setHostName("smtp.qq.com");
            //设置编码
            email.setCharset("utf-8");
            //要发送的邮箱
            email.addTo("m18569946421@163.com");
            //要发送的邮箱及其名称
            email.setFrom("1655749989@qq.com", "WLZ");
            //要发送的邮箱及其授权码
            email.setAuthentication("1655749989@qq.com", "hbxxyubdxdthdidh");
          //要发送的主题
            email.setSubject("ceshi");
            //要发送的内容
            email.setMsg("你好");
            email.send();


        } catch (EmailException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        YZEmail yzEmail = new YZEmail();
        yzEmail.YZM();
    }
}
