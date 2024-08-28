package com.example.dummyCalculator;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyCalculatorApplication {

	@Autowired
	CalculatorService calculatorService;

	public static void main(String[] args) {
		SpringApplication.run(DummyCalculatorApplication.class, args);
	}

	@PostConstruct
	public void outputResult(){
		System.out.println("Square Value of 2 is " + calculatorService.square(2));
	}

}
