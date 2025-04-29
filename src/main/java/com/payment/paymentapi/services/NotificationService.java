package com.payment.paymentapi.services;

import com.payment.paymentapi.domain.builders.notification.EmailBuilder;
import com.payment.paymentapi.domain.builders.notification.PushBuilder;
import com.payment.paymentapi.domain.builders.notification.SMSBuilder;
import com.payment.paymentapi.domain.builders.notification.WhatsAppBuilder;
import com.payment.paymentapi.domain.entities.notification.*;
import com.payment.paymentapi.domain.enums.EmailPriority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class NotificationService {

  public String sendNotification(String recipient, String data, String type) {
    final HashMap<String, Notification> NOTIFICATIONS = new HashMap<>() {
      {
        put("email", makeEmailNotification(recipient, data));
        put("sms", makeSMSNotification(recipient, data));
        put("push", makePushNotification(recipient, data));
        put("whatsapp", makeWhatsAppNotification(recipient, data));
      }
    };

    var notification = NOTIFICATIONS.get(type);
    return notification.sendMessage();
  }

  private Email makeEmailNotification(String recipient, String data) {
    var builder = new EmailBuilder();

    builder.setSubject("Monto total a pagar");
    builder.setRecipient(recipient);
    builder.setMessage(data);
    builder.setPriority(EmailPriority.HIGH);

    return builder.getResult();
  }

  private SMS makeSMSNotification(String phoneNumber, String data) {
    var builder = new SMSBuilder();

    builder.setSenderId("34345-6564-42445");
    builder.setRecipient(phoneNumber);
    builder.setMessage(data);
    // builder.setScheduleTime(scheduledTime);

    return builder.getResult();
  }

  private Push makePushNotification(String deviceToken, String data) {
    var builder = new PushBuilder();

    builder.setRecipient(deviceToken);
    builder.setTitle("Paga ahora, no te quedes con la deuda");
    builder.setMessage(data);

    return builder.getResult();
  }

  private WhatsApp makeWhatsAppNotification(String phoneNumber, String data) {
    var builder = new WhatsAppBuilder();

    builder.setRecipient(phoneNumber);
    builder.setInteractiveButtons(new ArrayList<>(List.of("cancel", "accept")));
    builder.setLanguage("es-CO");
    builder.setMessage(data);

    return builder.getResult();
  }
}
