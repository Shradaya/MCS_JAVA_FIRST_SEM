package com.payment.adapter;

import com.payment.domain.model.CardPaymentType;
import com.payment.domain.model.PaymentType;
import com.payment.domain.model.SurchargeResponse;
import com.payment.domain.port.PaymentSurcharge;
import com.payment.util.InputUtil;

public class CardPaymentSurchargeAdapter implements PaymentSurcharge {

    @Override
    public SurchargeResponse calculateSurcharge(double amount) {
        var intCardType = InputUtil.inputIntValue("From which card will you pay?\n" +
                "-----------------------------------------\n" +
                "1. Master Card\n" +
                "2. Visa Card\n" +
                "3. Amex Card\n" +
                "4. Gift Card\n"
        );
        var cardPaymentType = CardPaymentType.valueOf(intCardType);
        var surchargeAmt = getChargeFrom(amount, cardPaymentType);
        return SurchargeResponse.with(surchargeAmt, PaymentType.CARD.name(), cardPaymentType.name());
    }

    private double getChargeFrom(double amount, CardPaymentType cardPaymentType) {
        switch (cardPaymentType) {
            case MASTER_CARD:
                return (amount*2.5) / 100;
            case VISA_CARD:
                return (amount * 2.5) / 100;
            case AMEX_CARD:
                return (amount * 5) / 100;
            case GIFT_CARD:
                return 0.0;
        }
        return amount;
    }
}
