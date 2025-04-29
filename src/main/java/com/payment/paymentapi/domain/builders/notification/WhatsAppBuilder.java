package com.payment.paymentapi.domain.builders.notification;

import com.payment.paymentapi.domain.entities.notification.WhatsApp;

import java.util.List;

public class WhatsAppBuilder implements NotificationBuilder {
  private WhatsApp whatsapp;

  public WhatsAppBuilder() {
    reset();
  }

  @Override
  public void reset() {
    whatsapp = new WhatsApp();
  }

  @Override
  public void setMessage(String message) {
    whatsapp.setMessage(message);
  }

  @Override
  public void setRecipient(String recipient) {
    whatsapp.setPhoneNumber(recipient);
  }

  public void setMediaUrl(String mediaUrl) {
    whatsapp.setMediaUrl(mediaUrl);
  }

  public void setCaption(String caption) {
    whatsapp.setCaption(caption);
  }

  public void setInteractiveButtons(List<String> buttons) {
    whatsapp.setInteractiveButtons(buttons);
  }

  public void setLanguage(String language) {
    whatsapp.setLanguage(language);
  }

  public WhatsApp getResult() {
    return whatsapp;
  }
}
