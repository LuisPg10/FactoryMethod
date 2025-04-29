package com.payment.paymentapi.domain.dto.notification;

public class NotificationDTO {
  private String recipient;
  private String data;

  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
