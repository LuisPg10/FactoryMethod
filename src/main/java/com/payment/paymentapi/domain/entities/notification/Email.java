package com.payment.paymentapi.domain.entities.notification;

import com.payment.paymentapi.domain.enums.EmailPriority;

import java.util.List;

public class Email extends Notification {
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
    return "Message sent via email";
  }
}
