package com.payment.paymentapi.controllers;

import com.payment.paymentapi.domain.dto.notification.NotificationDTO;
import com.payment.paymentapi.domain.enums.NotificationType;
import com.payment.paymentapi.services.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/notification")
public class NotificationController {

  private final NotificationService service;

  public NotificationController(NotificationService service) {
    this.service = service;
  }

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    binder.registerCustomEditor(NotificationType.class, new PropertyEditorSupport() {
      @Override
      public void setAsText(String text) {
        setValue(NotificationType.valueOf(text.toUpperCase()));
      }
    });
  }

  @PostMapping("/send")
  public ResponseEntity<?> processPayment(@RequestParam NotificationType notificationType, @RequestBody NotificationDTO notification) {
    String message = service.sendNotification(notification.getRecipient(), notification.getData(), notificationType);

    Map<String, Object> response = new HashMap<>();
    response.put("message", message);
    response.put("status", "success");

    return ResponseEntity.ok(response);
  }
}