package com.payment.paymentapi.domain.factories.payment;

import com.payment.paymentapi.domain.entities.payment.Payment;
import com.payment.paymentapi.domain.entities.payment.PaypalPayment;

public class PaypalFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new PaypalPayment();
  }
}
