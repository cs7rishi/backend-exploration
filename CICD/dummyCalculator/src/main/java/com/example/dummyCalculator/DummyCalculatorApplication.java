package com.example.dummyCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyCalculatorApplication.class, args);
		System.out.println("Square Value of 2 is " + CalculatorService.square(2));
	}

}
