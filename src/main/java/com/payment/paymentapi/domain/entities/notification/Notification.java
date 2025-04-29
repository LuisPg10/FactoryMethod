package com.payment.paymentapi.domain.entities.notification;

public abstract class Notification {
  protected String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public abstract String sendMessage();
}
