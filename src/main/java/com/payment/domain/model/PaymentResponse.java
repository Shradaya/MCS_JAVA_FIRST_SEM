package com.payment.domain.model;

public class PaymentResponse {
    private double originalAmount;
    private double deliveryCharge;
    private double totalAmount;
    private double surcharge;
    private String createdAt;
    private PaymentType paymentType;
    private String paymentSubType;

    private PaymentResponse(double deliveryCharge, double totalAmount, double surcharge,
                            String createdAt, PaymentType paymentType, String paymentSubType,
                            double originalAmount) {
        this.deliveryCharge = deliveryCharge;
        this.totalAmount = totalAmount;
        this.surcharge = surcharge;
        this.createdAt = createdAt;
        this.paymentType = paymentType;
        this.paymentSubType = paymentSubType;
        this.originalAmount = originalAmount;
    }

    public static PaymentResponse with(double deliveryCharge,
                                       double totalAmount,
                                       double surcharge,
                                       String createdAt,
                                       PaymentType paymentType,
                                       String paymentSubType,
                                       double originalAmount) {
        return new PaymentResponse(deliveryCharge, totalAmount, surcharge, createdAt, paymentType, paymentSubType, originalAmount);
    }

    public static PaymentResponse with(double deliveryCharge,
                                       double totalAmount,
                                       double surcharge,
                                       String createdAt,
                                       PaymentType paymentType,
                                       double originalAmount) {
        return new PaymentResponse(deliveryCharge, totalAmount, surcharge, createdAt, paymentType, null, originalAmount);
    }

    @Override
    public String toString() {
        var string = "You got payment Response with \n" +
                "-----------------------------------------\n" +
                " Date = " + createdAt +
                "  \n Input Amount = " + originalAmount +
                ", \n Delivery Charge = " + deliveryCharge +
                ", \n Payment Type = " + paymentType +
                ", \n Surcharge = " + surcharge +
                ", \n Total Amount = " + totalAmount;
        if (this.paymentType == PaymentType.CARD)
            return string + "\n Payment SubType = " + paymentSubType;
        return string;
    }
}
