package com.example.dummyCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {

    @InjectMocks
    CalculatorService calculatorService;

    @Test
    void squareTest1(){
        assertEquals(4, calculatorService.square(2));
    }

    @Test
    void squareTest2(){
        assertEquals(9, calculatorService.square(3));
    }

}
