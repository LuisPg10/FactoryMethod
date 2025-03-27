package domain;

public class PaypalPayment extends Payment {

  public PaypalPayment(double finalAmount, double commissionRate, PaymentType type) {
    super(finalAmount, commissionRate, type);
  }

  @Override
  public double calculateFinalAmount() {
    double finalAmount = this.amount + (this.amount * this.commissionRate);
    System.out.println("Procesando pago con PayPal");

    // Validaciones específicas
    if (this.amount > 750) {
      finalAmount += 7; // Cargo adicional
    }

    return finalAmount;
  }
}
