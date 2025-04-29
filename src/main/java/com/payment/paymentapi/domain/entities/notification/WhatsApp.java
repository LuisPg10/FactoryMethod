package com.payment.paymentapi.domain.entities.notification;

import java.util.List;

public class WhatsApp extends Notification {
  private String phoneNumber;
  private String mediaUrl;
  private String caption;
  private List<String> interactiveButtons;
  private String language;
}
