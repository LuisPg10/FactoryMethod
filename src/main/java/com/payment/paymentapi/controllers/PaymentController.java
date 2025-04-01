package com.payment.paymentapi.controllers;

import com.payment.paymentapi.domain.enums.PaymentType;
import com.payment.paymentapi.services.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;

@RestController
@RequestMapping("/payment")
public class PaymentController {

  private final PaymentService service;

  public PaymentController(PaymentService service) {
    this.service = service;
  }

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    binder.registerCustomEditor(PaymentType.class, new PropertyEditorSupport() {
      @Override
      public void setAsText(String text) {
        setValue(PaymentType.valueOf(text.toUpperCase()));
      }
    });
  }

  @GetMapping("/finalAmount")
  public ResponseEntity<?> processPayment(@RequestParam PaymentType paymentType, @RequestParam double amount) {
    double finalAmount = service.processPayment(paymentType, amount);
    return ResponseEntity.ok(finalAmount);
  }
}