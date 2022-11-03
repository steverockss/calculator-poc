package com.soprasteriatest.calculator.service;

public class CalculatorServiceImpl  implements  CalculatorService{
    @Override
    public double add(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1-num2;
    }
}
