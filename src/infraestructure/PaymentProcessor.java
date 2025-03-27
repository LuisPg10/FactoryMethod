package infraestructure;

import domain.entities.Payment;
import domain.enums.PaymentType;
import domain.factories.*;
import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {

  private final static Map<PaymentType, PaymentFactory> factories = new HashMap<>() {
    {
      put(PaymentType.CREDIT_CARD, new CreditFactory());
      put(PaymentType.DEBIT_CARD, new DebitFactory());
      put(PaymentType.PAYPAL, new PaypalFactory());
    }
  };

  public double processPayment(PaymentType paymentType, double amount) {
    Payment payment = factories.get(paymentType).getPayment();
    return payment.calculateFinalAmount(amount);
  }
}
