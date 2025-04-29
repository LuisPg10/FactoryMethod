package com.payment.paymentapi.domain.builders.notification;

import com.payment.paymentapi.domain.entities.notification.SMS;

import java.time.LocalDateTime;

public class SMSBuilder implements NotificationBuilder {
  private SMS sms;

  public SMSBuilder() {
    reset();
  }

  @Override
  public void reset() {
    sms = new SMS();
  }

  @Override
  public void setMessage(String message) {
    sms.setMessage(message);
  }

  @Override
  public void setRecipient(String recipient) {
    sms.setPhoneNumber(recipient);
  }

  public void setSenderId(String senderId) {
    sms.setSenderId(senderId);
  }

  public void setDeliveryReportRequired(boolean required) {
    sms.setDeliveryReportRequired(required);
  }

  public void setScheduleTime(LocalDateTime scheduleTime) {
    sms.setScheduleTime(scheduleTime);
  }

  public SMS getResult() {
    return sms;
  }
}