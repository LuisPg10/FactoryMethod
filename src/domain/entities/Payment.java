package domain.entities;

import domain.enums.PaymentType;

public abstract class Payment {

  protected double commissionRate;
  protected PaymentType type;

  public Payment(double commissionRate, PaymentType type) {
    this.commissionRate = commissionRate;
    this.type = type;
  }

  public double getCommissionRate() {
    return commissionRate;
  }

  public PaymentType getType() {
    return type;
  }

  public void setCommissionRate(double commissionRate) {
    this.commissionRate = commissionRate;
  }

  public void setType(PaymentType type) {
    this.type = type;
  }

  public abstract double calculateFinalAmount(double amount);
}
