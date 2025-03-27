package presentation;

import domain.enums.PaymentType;
import infraestructure.PaymentProcessor;

public class Main {

  public static void main(String[] args) {
    PaymentProcessor paymentProcessor = new PaymentProcessor();
    double finalAmount = paymentProcessor.processPayment(PaymentType.DEBIT_CARD, 2000);
    System.out.println("\n" + finalAmount);
  }
}
