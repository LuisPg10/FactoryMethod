package com.payment.paymentapi.domain.entities.payment;

public class CreditPayment extends Payment {

  public CreditPayment() {
    super(0.03);
  }

  @Override
  public double calculateFinalAmount(double amount) {
    double finalAmount = amount + (amount * this.commissionRate);
    System.out.println("Procesando pago con tarjeta de crédito");

    // Specific validations
    if (amount > 1000) {
      finalAmount += 10; // Additional amount
    }

    return finalAmount;
  }
}
