package com.payment.paymentapi.domain.factories.payment;

import com.payment.paymentapi.domain.entities.payment.CreditPayment;
import com.payment.paymentapi.domain.entities.payment.Payment;

public class CreditFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new CreditPayment();
  }
}
