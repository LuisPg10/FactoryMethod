package com.payment.paymentapi.domain.entities.notification;

import com.payment.paymentapi.domain.enums.EmailPriority;

import java.util.List;

public class Email extends Notification {
  private String to;
  private String subject;
  private List<String> cc;
  private List<String> bcc;
  private List<String> attachments;
  private EmailPriority priority;
}
