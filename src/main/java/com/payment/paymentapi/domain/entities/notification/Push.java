package com.payment.paymentapi.domain.entities.notification;

import com.payment.paymentapi.domain.enums.PushPriority;

public class Push extends Notification {
  private String deviceToken;
  private String title;
  private String imageUrl;
  private PushPriority clickAction;

  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public void setClickAction(PushPriority clickAction) {
    this.clickAction = clickAction;
  }

  @Override
  public String sendMessage() {
    return "Message sent via push";
  }
}
