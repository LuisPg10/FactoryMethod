package com.payment.paymentapi.domain.builders.notification;

import com.payment.paymentapi.domain.entities.notification.Push;
import com.payment.paymentapi.domain.enums.PushPriority;

public class PushBuilder implements NotificationBuilder {
  private Push push;

  public PushBuilder() {
    reset();
  }

  @Override
  public void reset() {
    push = new Push();
  }

  @Override
  public void setMessage(String message) {
    push.setMessage(message);
  }

  @Override
  public void setRecipient(String recipient) {
    push.setDeviceToken(recipient);
  }

  public void setTitle(String title) {
    push.setTitle(title);
  }

  public void setImageUrl(String imageUrl) {
    push.setImageUrl(imageUrl);
  }

  public void setClickAction(PushPriority clickAction) {
    push.setClickAction(clickAction);
  }

  public Push getResult() {
    return push;
  }
}
