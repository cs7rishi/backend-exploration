package com.example.paymentService.services;

public interface PaymentStrategy {
    void register();

    String execute(double amount);
}
