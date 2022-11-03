package com.soprasteriatest.calculator;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.soprasteriatest.calculator.controller.CalculatorController;
import com.soprasteriatest.calculator.dto.CalculatorRequest;
import com.soprasteriatest.calculator.dto.CalculatorResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CalculatorControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private  final CalculatorController calculatorController;

    @Autowired
    public CalculatorControllerTest(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }

    @Test
    void testShouldAddTwoNumbersSuccessfully() {
        CalculatorRequest request = new CalculatorRequest(3, 4);
        CalculatorResponse response = calculatorController.addition(request);
    }

    @Test
    void shouldAddSuccessfully() throws Exception {
        CalculatorRequest request = new CalculatorRequest(3, 4);
        String requestJSON = objectMapper.writeValueAsString(request);
       mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/calculator/add").contentType(MediaType.APPLICATION_JSON).content(requestJSON)).andExpect(status().isOk());
    }

    @Test
    void shouldReturn400DueEmptyParams() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/calculator/add").contentType(MediaType.APPLICATION_JSON).content("")).andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturn404DueBadPath() throws Exception {
        CalculatorRequest request = new CalculatorRequest(3, 4);
        String requestJSON = objectMapper.writeValueAsString(request);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/calculator/addition").contentType(MediaType.APPLICATION_JSON).content(requestJSON)).andExpect(status().isNotFound());
    }

    @Test
    void shouldReturn400DueExceptionCausedByDivisionByZero() throws Exception {
        CalculatorRequest request = new CalculatorRequest(0, 0);
        String requestJSON = objectMapper.writeValueAsString(request);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/calculator/divide").contentType(MediaType.APPLICATION_JSON).content(requestJSON)).andExpect(status().isBadRequest());


    }
}
