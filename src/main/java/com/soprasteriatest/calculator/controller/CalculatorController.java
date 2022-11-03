package com.soprasteriatest.calculator.controller;

import com.soprasteriatest.calculator.dto.CalculatorRequest;
import com.soprasteriatest.calculator.dto.CalculatorResponse;
import com.soprasteriatest.calculator.service.CalculatorServiceImpl;
import io.corp.calculator.TracerImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorServiceImpl calculatorService;
    @PostMapping( "/add")
    public CalculatorResponse addition(@RequestBody CalculatorRequest calculatorRequest){
        double result = calculatorService.add(calculatorRequest.getFirstNum(), calculatorRequest.getSecondNum());
        return new CalculatorResponse(result);
    }

    @PostMapping( "/subtract")
    public CalculatorResponse subtraction(@RequestBody CalculatorRequest calculatorRequest){
        double result = calculatorService.subtract(calculatorRequest.getFirstNum(), calculatorRequest.getSecondNum());
        return new CalculatorResponse(result);
    }

    @PostMapping( "/multiply")
    public CalculatorResponse multiply(@RequestBody CalculatorRequest calculatorRequest){
        double result = calculatorService.multiply(calculatorRequest.getFirstNum(), calculatorRequest.getSecondNum());
        return new CalculatorResponse(result);
    }
    @PostMapping( "/divide")
    public CalculatorResponse divide(@RequestBody CalculatorRequest calculatorRequest){
        try {
            double result = calculatorService.divide(calculatorRequest.getFirstNum(), calculatorRequest.getSecondNum());
            return new CalculatorResponse(result);
        }
        catch(ArithmeticException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Can't divide by zero", e);
        }
    }

}
