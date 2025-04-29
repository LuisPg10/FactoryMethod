package com.payment.paymentapi.domain.entities.notification;

import java.time.LocalDateTime;

public class SMS extends Notification {
  private String phoneNumber;
  private String senderId;
  private boolean deliveryReportRequired;
  private LocalDateTime scheduleTime;
}
