package com.example.paymentService.services;

import com.example.paymentService.enums.PaymentMode;

public interface PaymentExecutor {
    String execute(PaymentMode mode, Double amount);
}
