package com.soprasteriatest.calculator;

import com.soprasteriatest.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    private  final CalculatorServiceImpl calculatorService;


    @Autowired
    public CalculatorServiceTest(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Test
    void testShouldAddTwoNumbersSuccessfully() {
        double result = calculatorService.add(50, 50);
        assertEquals(result, 100);
         result = calculatorService.add(12.6, 51.4);
        assertEquals(result, 64);
        result = calculatorService.add(1.6, 1.2);
        assertEquals(result, result,8);
    }
    @Test
    void testShouldSubtractTwoNumbersSuccessfully() {
        double result = calculatorService.subtract(50, 50);
        assertEquals(result, 0);
        result = calculatorService.subtract(10, 50);
        assertEquals(result, -40);
        result = calculatorService.subtract(5, 1.2);
        assertEquals(result,3.8);
    }
    @Test
    void testShouldMultiplyNumbersSuccessfully() {
        double result = calculatorService.multiply(5, 5);
        assertEquals(result, 25);
        result = calculatorService.multiply(1, 0);
        assertEquals(result, 0.0);
        result = calculatorService.multiply(1.5, 2);
        assertEquals(result, 3.0);
    }
    @Test
    void testShouldDivideNumbersSuccessfully() throws Exception {
        double result = calculatorService.divide(50, 50);
        assertEquals(result, 1);
        result = calculatorService.divide(5, 2);
        assertEquals(result, 2.5);
    }

}
