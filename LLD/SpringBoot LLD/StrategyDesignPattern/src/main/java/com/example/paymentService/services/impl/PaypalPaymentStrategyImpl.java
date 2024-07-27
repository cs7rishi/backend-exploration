package com.example.paymentService.services.impl;

import com.example.paymentService.enums.PaymentMode;
import com.example.paymentService.services.PaymentStrategy;
import com.example.paymentService.services.impl.PaymentExecutorImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentStrategyImpl implements PaymentStrategy {
    @Override
    @PostConstruct
    public void register() {
        PaymentExecutorImpl.addPaymentStrategy(PaymentMode.PAYPAL, this);
    }

    @Override
    public String execute(double amount) {
        return "Amount paid via paypal: " + amount;
    }
}
