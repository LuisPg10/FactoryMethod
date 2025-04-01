package com.payment.paymentapi.domain.factories;

import com.payment.paymentapi.domain.entities.Payment;

public abstract class PaymentFactory {

  public abstract Payment getPayment();
}
