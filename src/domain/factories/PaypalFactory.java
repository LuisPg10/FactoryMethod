package domain.factories;

import domain.entities.Payment;
import domain.entities.PaypalPayment;

public class PaypalFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new PaypalPayment();
  }
}
