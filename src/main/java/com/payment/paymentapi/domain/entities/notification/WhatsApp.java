package com.payment.paymentapi.domain.entities.notification;

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
    return "Message sent via whatsapp";
  }
}
