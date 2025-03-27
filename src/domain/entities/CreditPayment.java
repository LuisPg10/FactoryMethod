package domain.entities;

import domain.enums.PaymentType;

public class CreditPayment extends Payment {

  public CreditPayment() {
    super(0.03, PaymentType.CREDIT_CARD);
  }

  @Override
  public double calculateFinalAmount(double amount) {
    double finalAmount = amount + (amount * this.commissionRate);
    System.out.println("Procesando pago con tarjeta de crédito");

    // Validaciones específicas
    if (amount > 1000) {
      finalAmount += 10; // Cargo adicional
    }

    return finalAmount;
  }
}
