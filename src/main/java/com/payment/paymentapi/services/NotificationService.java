package com.payment.paymentapi.services;

import com.payment.paymentapi.domain.enums.NotificationType;
import com.payment.paymentapi.domain.factories.notification.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class NotificationService {

  final HashMap<NotificationType, NotificationFactory> FACTORIES = new HashMap<>() {
    {
      put(NotificationType.EMAIL, new EmailFactory());
      put(NotificationType.PUSH, new PushFactory());
      put(NotificationType.SMS, new SMSFactory());
      put(NotificationType.WHATSAPP, new WhatsAppFactory());
    }
  };

  public String sendNotification(String recipient, String message, NotificationType type) {
    var notification = FACTORIES.get(type).buildNotification(recipient, message);
    return notification.sendMessage();
  }
}
