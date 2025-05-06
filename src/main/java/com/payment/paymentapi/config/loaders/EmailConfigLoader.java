package com.payment.paymentapi.config.loaders;

import com.payment.paymentapi.config.Environtment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class EmailConfigLoader {

  public static JavaMailSender load() {
    JavaMailSenderImpl sender = new JavaMailSenderImpl();

    sender.setHost("smtp.gmail.com");
    sender.setPort(587);
    sender.setUsername(Environtment.getEmailUsername());
    sender.setPassword(Environtment.getEmailPassword());

    Properties props = sender.getJavaMailProperties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.starttls.required", "true");
    props.put("mail.smtp.connectiontimeout", "10000");
    props.put("mail.smtp.timeout", "10000");
    props.put("mail.smtp.writetimeout", "10000");

    return sender;
  }
}