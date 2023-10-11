package com.godhelp.boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculatorPage() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculate(
        @RequestParam double operand1,
        @RequestParam double operand2,
        @RequestParam String operator
    ) {
        double result;
        switch (operator) {
            case "add":
                result = operand1 + operand2;
                break;
            case "subtract":
                result = operand1 - operand2;
                break;
            case "multiply":
                result = operand1 * operand2;
                break;
            case "divide":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    throw new IllegalArgumentException("Ділення на нуль неможливе.");
                }
                break;
            default:
                throw new IllegalArgumentException("Недійсна операція.");
        }
        return ResponseEntity.ok(result);
    }
}

