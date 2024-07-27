package com.example.paymentService.services.impl;

import com.example.paymentService.enums.PaymentMode;
import com.example.paymentService.services.PaymentStrategy;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    @PostConstruct
    public void register() {
        PaymentExecutorImpl.addPaymentStrategy(PaymentMode.CREDIT_CARD, this);
    }

    @Override
    public String execute(double amount) {
        return "Amount paid via credit card: " + amount;
    }
}
