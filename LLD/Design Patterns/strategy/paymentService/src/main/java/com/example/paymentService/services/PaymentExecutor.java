package com.example.paymentService;

import com.example.paymentService.enums.PaymentMode;

public interface PaymentExecutor {
    void execute(PaymentMode mode, Double amount);
}
