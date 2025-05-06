package com.payment.paymentapi.domain.factories.notification;

import com.payment.paymentapi.domain.entities.notification.Notification;

public interface NotificationFactory {

  Notification buildNotification(String recipient, String message);
}
