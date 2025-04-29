package com.payment.paymentapi.domain.entities.payment;

public class PaypalPayment extends Payment {

  public PaypalPayment() {
    super(0.02);
  }

  @Override
  public double calculateFinalAmount(double amount) {
    double finalAmount = amount + (amount * this.commissionRate);
    System.out.println("Procesando pago con PayPal");

    // Specific validations
    if (amount > 750) {
      finalAmount += 7; // Additional amount
    }

    return finalAmount;
  }
}
