package com.payment.paymentapi.domain.entities.notification;

import com.payment.paymentapi.domain.enums.PushPriority;

public class Push extends Notification {
  private String deviceToken;
  private String title;
  private String imageUrl;
  private PushPriority clickAction;
}
