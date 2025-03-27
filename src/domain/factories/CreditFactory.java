package domain.factories;

import domain.entities.CreditPayment;
import domain.entities.Payment;

public class CreditFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new CreditPayment();
  }
}
