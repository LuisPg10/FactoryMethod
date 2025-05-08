package com.payment.paymentapi.domain.entities.notification;

import com.payment.paymentapi.config.Environtment;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

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
    Twilio.init(Environtment.getTwilioAccountSID(), Environtment.getTwilioAuthToken());
    var sender = new PhoneNumber(this.senderId);
    var recipient = new PhoneNumber(this.phoneNumber);
    Message.creator(recipient, sender, this.message).create();

    return "Message sent via SMS";
  }
}
