package domain.entities;

import domain.enums.PaymentType;

public class DebitPayment extends Payment {

  public DebitPayment(double finalAmount, double commissionRate, PaymentType type) {
    super(finalAmount, commissionRate, type);
  }

  @Override
  public double calculateFinalAmount() {
    double finalAmount = this.amount + (this.amount * commissionRate);
    System.out.println("Procesando pago con tarjeta de débito");

    // Validaciones específicas
    if (this.amount > 500) {
      finalAmount += 5; // Cargo adicional
    }

    return finalAmount;
  }
}
