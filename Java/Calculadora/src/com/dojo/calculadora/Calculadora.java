package com.dojo.calculadora;

import java.io.Serializable;

public class Calculadora implements Serializable{
	
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	//GETTERS
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getResult() {
		System.out.println("El resultado es: " + result);
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	//METODOS
	public void performOperation() {
        switch (operation) {
            case "+":
                result = operandOne + operandTwo;
                break;
            case "-":
                result = operandOne - operandTwo;
                break;
            // FUTURAS FUNCIONES
            default:
                System.out.println("Operación no válida");
        }
	}
	
	
}
