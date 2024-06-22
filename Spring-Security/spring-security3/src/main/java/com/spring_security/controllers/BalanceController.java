package com.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/mybalance")
    public String getBalanceDetails() {
        return "Here are the balance details from the DB";
    }

}
