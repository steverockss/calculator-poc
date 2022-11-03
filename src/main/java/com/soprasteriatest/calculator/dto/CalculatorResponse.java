package com.soprasteriatest.calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class CalculatorResponse {
    private double result;
}


