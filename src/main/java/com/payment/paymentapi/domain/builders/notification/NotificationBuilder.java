package com.payment.paymentapi.domain.builders.notification;

public interface NotificationBuilder {
  void reset();

  void setSender(String sender);

  void setMessage(String message);

  void setRecipient(String recipient);
}
