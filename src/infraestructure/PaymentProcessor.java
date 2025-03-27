package infraestructure;

public class PaymentProcessor {

  public double processPayment(String paymentType, double amount) {
    double finalAmount = 0.0;

    if (paymentType.equals("CREDIT_CARD")) {
      // Lógica de procesamiento para tarjeta de crédito
      double commissionRate = 0.03;
      finalAmount = amount + (amount * commissionRate);
      System.out.println("Procesando pago con tarjeta de crédito");

      // Validaciones específicas
      if (amount > 1000) {
        finalAmount += 10; // Cargo adicional
      }
    } else if (paymentType.equals("DEBIT_CARD")) {
      // Lógica de procesamiento para tarjeta de débito
      double commissionRate = 0.01;
      finalAmount = amount + (amount * commissionRate);
      System.out.println("Procesando pago con tarjeta de débito");

      // Validaciones específicas
      if (amount > 500) {
        finalAmount += 5; // Cargo adicional
      }
    } else if (paymentType.equals("PAYPAL")) {
      // Lógica de procesamiento para PayPal
      double commissionRate = 0.02;
      finalAmount = amount + (amount * commissionRate);
      System.out.println("Procesando pago con PayPal");

      // Validaciones específicas
      if (amount > 750) {
        finalAmount += 7; // Cargo adicional
      }
    } else {
      throw new IllegalArgumentException("Método de pago no soportado");
    }

    return finalAmount;
  }
}
