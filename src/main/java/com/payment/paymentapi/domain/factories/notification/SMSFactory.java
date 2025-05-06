package com.payment.paymentapi.domain.factories.notification;

import com.payment.paymentapi.domain.builders.notification.SMSBuilder;
import com.payment.paymentapi.domain.entities.notification.Notification;

import java.time.LocalDateTime;

public class SMSFactory implements NotificationFactory {

  @Override
  public Notification buildNotification(String recipient, String message) {
    var builder = new SMSBuilder();

    builder.setSenderId("34345-6564-42445");
    builder.setRecipient(recipient);
    builder.setMessage(message);
    builder.setScheduleTime(LocalDateTime.now().plusSeconds(10));

    return builder.getResult();
  }
}
