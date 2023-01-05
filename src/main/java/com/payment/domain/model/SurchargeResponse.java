package com.payment.domain.model;

public class SurchargeResponse {
    private double surchargeAmt;
    private String paymentType;
    private String paymentSubType;

    private SurchargeResponse(double surchargeAmt, String paymentType, String paymentSubType) {
        this.surchargeAmt = surchargeAmt;
        this.paymentType = paymentType;
        this.paymentSubType = paymentSubType;
    }

    public double getSurchargeAmt() {
        return surchargeAmt;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getPaymentSubType() {
        return paymentSubType;
    }

    public static SurchargeResponse with(double surchargeAmount, String paymentType, String paymentSubType) {
        return new SurchargeResponse(surchargeAmount, paymentType, paymentSubType);
    }
}
