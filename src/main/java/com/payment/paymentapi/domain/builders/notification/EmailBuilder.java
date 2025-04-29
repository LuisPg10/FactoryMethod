package com.payment.paymentapi.domain.builders.notification;

import com.payment.paymentapi.domain.entities.notification.Email;
import com.payment.paymentapi.domain.enums.EmailPriority;

import java.util.List;

public class EmailBuilder implements NotificationBuilder {
  private Email email;

  public EmailBuilder() {
    reset();
  }

  @Override
  public void reset() {
    email = new Email();
  }

  @Override
  public void setMessage(String message) {
    email.setMessage(message);
  }

  @Override
  public void setRecipient(String recipient) {
    email.setTo(recipient);
  }

  public void setSubject(String subject) {
    email.setSubject(subject);
  }

  public void setCc(List<String> cc) {
    email.setCc(cc);
  }

  public void setBcc(List<String> bcc) {
    email.setBcc(bcc);
  }

  public void setAttachments(List<String> attachments) {
    email.setAttachments(attachments);
  }

  public void setPriority(EmailPriority priority) {
    email.setPriority(priority);
  }

  public Email getResult() {
    return email;
  }
}
