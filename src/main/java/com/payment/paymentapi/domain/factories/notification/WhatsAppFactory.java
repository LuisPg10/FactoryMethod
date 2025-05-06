package com.payment.paymentapi.domain.factories.notification;

import com.payment.paymentapi.domain.builders.notification.WhatsAppBuilder;
import com.payment.paymentapi.domain.entities.notification.Notification;

import java.util.ArrayList;
import java.util.List;

public class WhatsAppFactory implements NotificationFactory {

  @Override
  public Notification buildNotification(String recipient, String message) {
    var builder = new WhatsAppBuilder();

    builder.setRecipient(recipient);
    builder.setInteractiveButtons(new ArrayList<>(List.of("cancel", "accept")));
    builder.setLanguage("es-CO");
    builder.setMessage(message);

    return builder.getResult();
  }
}
