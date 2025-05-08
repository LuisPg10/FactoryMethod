package com.payment.paymentapi.domain.entities.notification;

import com.payment.paymentapi.config.Environtment;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.util.List;

public class WhatsApp extends Notification {
  private String phoneNumber;
  private String mediaUrl;
  private String caption;
  private List<String> interactiveButtons;
  private String language;

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public void setInteractiveButtons(List<String> interactiveButtons) {
    this.interactiveButtons = interactiveButtons;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public String sendMessage() {
    Twilio.init(Environtment.getTwilioAccountSID(), Environtment.getTwilioAuthToken());
    var sender = new PhoneNumber(this.sender);
    var recipient = new PhoneNumber(this.phoneNumber);
    Message.creator(recipient, sender, this.message).create();

    return "Message sent via whatsapp";
  }
}
