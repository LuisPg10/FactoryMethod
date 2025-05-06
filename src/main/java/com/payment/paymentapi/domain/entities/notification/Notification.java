package com.payment.paymentapi.domain.entities.notification;

public abstract class Notification {
  protected String sender;
  protected String message;

  public void setSender(String sender) {
    this.sender = sender;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public abstract String sendMessage();
}
