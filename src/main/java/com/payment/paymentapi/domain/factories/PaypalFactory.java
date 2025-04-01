package com.payment.paymentapi.domain.factories;

import com.payment.paymentapi.domain.entities.Payment;
import com.payment.paymentapi.domain.entities.PaypalPayment;

public class PaypalFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new PaypalPayment();
  }
}
