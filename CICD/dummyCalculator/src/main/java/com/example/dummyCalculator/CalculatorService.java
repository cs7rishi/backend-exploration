package com.example.dummyCalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public  int square(int value){
        return value * value;
    }

    public int cube(int value){
        return value*value*value;
    }
}
