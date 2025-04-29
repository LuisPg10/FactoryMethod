package com.payment.paymentapi.domain.entities.payment;

public abstract class Payment {

  protected double commissionRate;

  public Payment(double commissionRate) {
    this.commissionRate = commissionRate;
  }

  public double getCommissionRate() {
    return commissionRate;
  }

  public void setCommissionRate(double commissionRate) {
    this.commissionRate = commissionRate;
  }

  public abstract double calculateFinalAmount(double amount);
}
