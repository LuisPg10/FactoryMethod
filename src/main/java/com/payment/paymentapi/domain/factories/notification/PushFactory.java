package com.payment.paymentapi.domain.factories.notification;

import com.payment.paymentapi.domain.builders.notification.PushBuilder;
import com.payment.paymentapi.domain.entities.notification.Notification;

public class PushFactory implements NotificationFactory {
  @Override
  public Notification buildNotification(String recipient, String message) {
    var builder = new PushBuilder();

    builder.setRecipient(recipient);
    builder.setTitle("Paga ahora, no te quedes con la deuda");
    builder.setMessage(message);

    return builder.getResult();
  }
}
