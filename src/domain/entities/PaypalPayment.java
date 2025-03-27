package domain.entities;

import domain.enums.PaymentType;

public class PaypalPayment extends Payment {

  public PaypalPayment() {
    super(0.02, PaymentType.PAYPAL);
  }

  @Override
  public double calculateFinalAmount(double amount) {
    double finalAmount = amount + (amount * this.commissionRate);
    System.out.println("Procesando pago con PayPal");

    // Validaciones específicas
    if (amount > 750) {
      finalAmount += 7; // Cargo adicional
    }

    return finalAmount;
  }
}
