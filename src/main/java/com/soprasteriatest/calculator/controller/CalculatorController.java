package com.soprasteriatest.calculator.controller;

import com.soprasteriatest.calculator.dto.CalculatorRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @PostMapping
    public void addition(@RequestBody CalculatorRequest calculatorRequest){

    }
}
