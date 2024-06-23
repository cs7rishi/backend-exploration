package com.spring_security.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/mycards")
    public String getCardDetails() {
        return "Here are the card details from the DB";
    }

}
