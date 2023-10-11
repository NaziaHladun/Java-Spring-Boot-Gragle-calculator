package com.godhelp.boot.model;

public class CalculatorModel {
    public double operand1;
    public double operand2;
    public String operator;
    public double result;

    public CalculatorModel(double operand1, double operand2, String operator, double result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
        this.result = result;
    }

}
