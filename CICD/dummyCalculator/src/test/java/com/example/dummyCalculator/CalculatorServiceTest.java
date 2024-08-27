package com.example.dummyCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void squareTest1(){
        assertEquals(4, CalculatorService.square(2));
    }

    @Test
    void squareTest2(){
        assertEquals(9, CalculatorService.square(3));
    }

}
