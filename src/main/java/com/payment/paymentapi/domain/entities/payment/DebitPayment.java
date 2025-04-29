package com.payment.paymentapi.domain.entities.payment;

public class DebitPayment extends Payment {

  public DebitPayment() {
    super(0.01);
  }

  @Override
  public double calculateFinalAmount(double amount) {
    double finalAmount = amount + (amount * this.commissionRate);
    System.out.println("Procesando pago con tarjeta de débito");

    // Specific validations
    if (amount > 500) {
      finalAmount += 5; // Additional amount
    }

    return finalAmount;
  }
}
