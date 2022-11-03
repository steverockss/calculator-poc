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
        tracer.trace("The result of the operation is "+ (num1+ num2));
        return num1+num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        tracer.trace("Subtracting "+ num1+ " and "+ num2);
        tracer.trace("The result of the operation is "+ (num1 -num2));
        return num1-num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        tracer.trace("Multiplying "+ num1+ " and "+ num2);
        tracer.trace("The result of the operation is "+ (num1 * num2));
        return (num1 * num2);
    }

    @Override
    public double divide(double num1, double num2) throws ArithmeticException {
        if(num2 == 0){
            throw new ArithmeticException("Can't divide by zero");
        }
        tracer.trace("Multiplying "+ num1+ " and "+ num2);
        tracer.trace("The result of the operation is "+ (num1 / num2));
        return num1 / num2;
    }
}
