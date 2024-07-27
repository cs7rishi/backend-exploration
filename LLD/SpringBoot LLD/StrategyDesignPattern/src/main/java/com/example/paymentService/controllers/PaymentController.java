package com.example.paymentService.controllers;

import com.example.paymentService.services.PaymentExecutor;
import com.example.paymentService.enums.PaymentMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentExecutor paymentExecutor;

    @GetMapping("/pay")
    public String pay(@RequestParam PaymentMode mode, @RequestParam Double amount) {
        return paymentExecutor.execute(mode, amount);
    }
}
