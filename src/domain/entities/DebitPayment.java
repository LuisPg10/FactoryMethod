package domain.entities;

import domain.enums.PaymentType;

public class DebitPayment extends Payment {

  public DebitPayment() {
    super(0.01, PaymentType.DEBIT_CARD);
  }

  @Override
  public double calculateFinalAmount(double amount) {
    double finalAmount = amount + (amount * commissionRate);
    System.out.println("Procesando pago con tarjeta de débito");

    // Validaciones específicas
    if (amount > 500) {
      finalAmount += 5; // Cargo adicional
    }

    return finalAmount;
  }
}
