package com.inaction.springboot.mail.controller;

import com.inaction.springboot.mail.pojo.Mail;
import com.inaction.springboot.mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 邮件控制层
 *
 * @author pc.chen
 */
@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    /**
     * 触发邮件发送
     *
     * @return
     */
    @PostMapping("/trigger")
    public Integer trigger() throws Exception {

        Mail mail = new Mail();
        mail.setMailFrom("yun.busi@sendmail.shunwang.com");
        mail.setMailTo("pc.chen@shunwang.com");
        mail.setMailSubject("Spring Boot - Email with FreeMarker template");

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("firstName", "David");
        model.put("lastName", "Pham");
        model.put("location", "Columbus");
        model.put("signature", "www.javabycode.com");
        mail.setModel(model);

        emailService.sendEmail(mail);

        return 200;
    }

}
