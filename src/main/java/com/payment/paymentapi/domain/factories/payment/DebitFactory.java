package com.payment.paymentapi.domain.factories.payment;

import com.payment.paymentapi.domain.entities.payment.DebitPayment;
import com.payment.paymentapi.domain.entities.payment.Payment;

public class DebitFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new DebitPayment();
  }
}
