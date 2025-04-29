package com.payment.paymentapi.controllers;

import com.payment.paymentapi.domain.dto.notification.NotificationDTO;
import com.payment.paymentapi.services.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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

    Map<String, Object> response = new HashMap<>();
    response.put("message", message);
    response.put("status", "success");

    return ResponseEntity.ok(response);
  }
}