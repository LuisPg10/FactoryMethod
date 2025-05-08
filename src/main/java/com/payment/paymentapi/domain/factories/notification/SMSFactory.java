package com.payment.paymentapi.domain.factories.notification;

import com.payment.paymentapi.config.Environtment;
import com.payment.paymentapi.domain.builders.notification.SMSBuilder;
import com.payment.paymentapi.domain.entities.notification.Notification;

import java.time.LocalDateTime;

public class SMSFactory implements NotificationFactory {

  @Override
  public Notification buildNotification(String recipient, String message) {
    var builder = new SMSBuilder();

    builder.setSenderId(Environtment.getTwilioNumber());
    builder.setRecipient(recipient);
    builder.setMessage(message);
    builder.setScheduleTime(LocalDateTime.now().plusSeconds(10));
    builder.setDeliveryReportRequired(false);
    return builder.getResult();
  }
}
