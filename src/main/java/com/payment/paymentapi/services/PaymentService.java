package com.payment.paymentapi.services;

import com.payment.paymentapi.domain.entities.Payment;
import com.payment.paymentapi.domain.enums.PaymentType;
import com.payment.paymentapi.domain.factories.CreditFactory;
import com.payment.paymentapi.domain.factories.DebitFactory;
import com.payment.paymentapi.domain.factories.PaymentFactory;
import com.payment.paymentapi.domain.factories.PaypalFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

  private final static Map<PaymentType, PaymentFactory> factories = new HashMap<>() {
    {
      put(PaymentType.CREDIT_CARD, new CreditFactory());
      put(PaymentType.DEBIT_CARD, new DebitFactory());
      put(PaymentType.PAYPAL, new PaypalFactory());
    }
  };

  public double processPayment(PaymentType paymentType, double amount) {
    Payment payment = factories.get(paymentType).getPayment();
    return payment.calculateFinalAmount(amount);
  }
}
