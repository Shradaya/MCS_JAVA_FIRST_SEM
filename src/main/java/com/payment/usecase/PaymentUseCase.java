package com.payment.usecase;

import com.payment.domain.model.PaymentReq;
import com.payment.domain.model.PaymentResponse;

public interface PaymentUseCase {
    PaymentResponse paymentCalculation(PaymentReq request);
}
