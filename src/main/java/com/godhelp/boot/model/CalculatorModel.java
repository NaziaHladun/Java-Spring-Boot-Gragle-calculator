package com.godhelp.boot.model;

public class CalculatorModel {
    private double result;
    private String errorMessage;

    public CalculatorModel(double result) {
        this.result = result;
    }

    public CalculatorModel(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}