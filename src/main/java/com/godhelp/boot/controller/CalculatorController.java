package com.godhelp.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.godhelp.boot.model.CalculatorModel;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation, Model model) {
        CalculatorModel CalculatorModel;

        switch (operation) {
            case "add":
                CalculatorModel = new CalculatorModel(num1 + num2);
                break;
            case "subtract":
                CalculatorModel = new CalculatorModel(num1 - num2);
                break;
            case "multiply":
                CalculatorModel = new CalculatorModel(num1 * num2);
                break;
            case "divide":
                if(num2 != 0) {
                    CalculatorModel = new CalculatorModel(num1 / num2);
                } else {
                    CalculatorModel = new CalculatorModel("Division by zero is not allowed!");
                }
                break;
            default:
                CalculatorModel = new CalculatorModel(0);
                break;
        }

        model.addAttribute("CalculatorModel", CalculatorModel);
        return "calculator";
    }
}
