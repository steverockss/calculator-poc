package com.soprasteriatest.calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalculatorRequest {

    private double firstNum;
    private double secondNum;
}
