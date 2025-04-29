package com.payment.paymentapi.controllers;

import com.payment.paymentapi.domain.dto.notification.NotificationDTO;
import com.payment.paymentapi.services.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

  private final NotificationService service;

  public NotificationController(NotificationService service) {
    this.service = service;
  }

  @PostMapping("/send")
  public ResponseEntity<?> processPayment(@RequestParam String notificationType, @RequestBody NotificationDTO notification) {
    String message = service.sendNotification(notification.getRecipient(), notification.getData(), notificationType);
    return ResponseEntity.ok(message);
  }
}