package domain.factories;

import domain.entities.DebitPayment;
import domain.entities.Payment;

public class DebitFactory extends PaymentFactory {

  @Override
  public Payment getPayment() {
    return new DebitPayment();
  }
}
