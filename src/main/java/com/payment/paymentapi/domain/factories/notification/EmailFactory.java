package com.payment.paymentapi.domain.factories.notification;

import com.payment.paymentapi.domain.builders.notification.EmailBuilder;
import com.payment.paymentapi.domain.entities.notification.Notification;
import com.payment.paymentapi.domain.enums.EmailPriority;

public class EmailFactory implements NotificationFactory {

  @Override
  public Notification buildNotification(String recipient, String message) {
    var builder = new EmailBuilder();

    builder.setSubject("Monto total a pagar");
    builder.setRecipient(recipient);
    builder.setMessage(message);
    builder.setPriority(EmailPriority.HIGH);

    return builder.getResult();
  }
}
