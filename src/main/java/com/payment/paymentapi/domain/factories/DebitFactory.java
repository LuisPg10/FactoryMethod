package com.payment.paymentapi.domain.factories;

import com.payment.paymentapi.domain.entities.DebitPayment;
import com.payment.paymentapi.domain.entities.Payment;

public class DebitFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new DebitPayment();
  }
}
