package com.soprasteriatest.calculator.controller;

import com.soprasteriatest.calculator.dto.CalculatorRequest;
import com.soprasteriatest.calculator.service.CalculatorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculator")
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;
    @PostMapping
    public void addition(@RequestBody CalculatorRequest calculatorRequest){
        calculatorService.add(calculatorRequest.getFirstNum(), calculatorRequest.getSecondNum());
    }
}
