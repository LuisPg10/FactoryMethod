package com.payment.paymentapi.domain.factories.payment;

import com.payment.paymentapi.domain.entities.payment.Payment;

public abstract class PaymentFactory {

  public abstract Payment getPayment();
}
