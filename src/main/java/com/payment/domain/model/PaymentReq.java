package com.payment.domain.model;

public class PaymentReq {
    private double amount;
    private PaymentType paymentType;

    public PaymentReq(double amount, PaymentType paymentType) {
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public double deliverCharge(double amount) {
        if (amount < 500) {
            return 100;
        } else if (amount >= 500 && amount < 1000) {
            return 50;
        } else {
            return 0;
        }
    }
}

