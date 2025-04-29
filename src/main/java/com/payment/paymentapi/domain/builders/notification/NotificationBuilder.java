package com.payment.paymentapi.domain.builders.notification;

public interface NotificationBuilder {
  void reset();

  void setMessage(String message);

  void setRecipient(String recipient);
}
