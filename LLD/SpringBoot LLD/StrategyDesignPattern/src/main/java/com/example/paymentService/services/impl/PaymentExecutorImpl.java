package com.example.paymentService.services.impl;

import com.example.paymentService.enums.PaymentMode;
import com.example.paymentService.services.PaymentExecutor;
import com.example.paymentService.services.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentExecutorImpl implements PaymentExecutor {
    private static Map<PaymentMode, PaymentStrategy> paymentStrategyMap = new HashMap();

    public static void addPaymentStrategy(PaymentMode mode, PaymentStrategy paymentStrategy) {
        paymentStrategyMap.put(mode, paymentStrategy);
    }

    @Override
    public String execute(PaymentMode mode, Double amount) {
        return paymentStrategyMap.get(mode).execute(amount);
    }
}
