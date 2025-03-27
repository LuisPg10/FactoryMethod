package domain;

public class CreditPayment extends Payment {

  public CreditPayment(double finalAmount, double commissionRate, PaymentType type) {
    super(finalAmount, commissionRate, type);
  }

  @Override
  public double calculateFinalAmount() {
    double finalAmount = this.amount + (this.amount * this.commissionRate);
    System.out.println("Procesando pago con tarjeta de crédito");

    // Validaciones específicas
    if (this.amount > 1000) {
      finalAmount += 10; // Cargo adicional
    }

    return finalAmount;
  }
}
