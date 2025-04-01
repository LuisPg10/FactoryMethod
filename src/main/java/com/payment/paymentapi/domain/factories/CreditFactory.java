package com.payment.paymentapi.domain.factories;

import com.payment.paymentapi.domain.entities.CreditPayment;
import com.payment.paymentapi.domain.entities.Payment;

public class CreditFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new CreditPayment();
  }
}
