package com.payment.paymentapi.domain.entities.notification;

import java.time.LocalDateTime;

public class SMS extends Notification {
  private String phoneNumber;
  private String senderId;
  private boolean deliveryReportRequired;
  private LocalDateTime scheduleTime;

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public void setDeliveryReportRequired(boolean deliveryReportRequired) {
    this.deliveryReportRequired = deliveryReportRequired;
  }

  public void setScheduleTime(LocalDateTime scheduleTime) {
    this.scheduleTime = scheduleTime;
  }

  @Override
  public String sendMessage() {
    return "Message sent via SMS";
  }
}
