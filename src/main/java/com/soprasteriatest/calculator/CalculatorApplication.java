package com.soprasteriatest.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.corp.calculator.TracerImpl;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		TracerImpl tracer = new TracerImpl();
		tracer.trace("Bon Jour");
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
