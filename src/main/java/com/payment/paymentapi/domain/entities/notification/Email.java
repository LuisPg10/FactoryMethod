package com.payment.paymentapi.domain.entities.notification;

import com.payment.paymentapi.config.loaders.EmailConfigLoader;
import com.payment.paymentapi.domain.enums.EmailPriority;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.util.List;

public class Email extends Notification {
  private final JavaMailSender mailSender = EmailConfigLoader.load();

  private String to;
  private String subject;
  private List<String> cc;
  private List<String> bcc;
  private List<String> attachments;
  private EmailPriority priority;

  public void setTo(String to) {
    this.to = to;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setCc(List<String> cc) {
    this.cc = cc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }

  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }

  public void setPriority(EmailPriority priority) {
    this.priority = priority;
  }

  @Override
  public String sendMessage() {
    MimeMessage mimeMessage = this.mailSender.createMimeMessage();

    try {
      mimeMessage.setSubject(this.subject);
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
      helper.setTo(this.to);
      helper.setText(this.message);
      helper.setFrom(this.sender);
      this.mailSender.send(mimeMessage);

    } catch (MessagingException e) {
      System.out.println(e.getMessage());
    }

    return "Message sent via email";
  }
}
