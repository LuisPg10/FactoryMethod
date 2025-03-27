package domain.entities;

import domain.enums.PaymentType;

public abstract class Payment {

  protected double amount;
  protected double commissionRate;
  protected PaymentType type;

  public Payment(double finalAmount, double commissionRate, PaymentType type) {
    this.amount = finalAmount;
    this.commissionRate = commissionRate;
    this.type = type;
  }

  public double getAmount() {
    return amount;
  }

  public double getCommissionRate() {
    return commissionRate;
  }

  public PaymentType getType() {
    return type;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setCommissionRate(double commissionRate) {
    this.commissionRate = commissionRate;
  }

  public void setType(PaymentType type) {
    this.type = type;
  }

  public abstract double calculateFinalAmount();
}
