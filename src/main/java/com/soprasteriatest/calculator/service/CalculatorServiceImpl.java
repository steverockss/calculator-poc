package com.soprasteriatest.calculator.service;

import io.corp.calculator.TracerImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CalculatorServiceImpl  implements  CalculatorService{

    private final TracerImpl  tracer = new TracerImpl();
    @Override
    public double add(double num1, double num2) {
        tracer.trace("Adding "+ num1+ " and "+ num2);
        tracer.trace("Result:: "+ (num1+ num2));
        return num1+num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        tracer.trace("Subtracting "+ num1+ " and "+ num2);
        tracer.trace("Result:: "+ (num1 - num2));
        return num1-num2;
    }
}
