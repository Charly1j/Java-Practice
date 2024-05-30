package com.dojo.calculadora;

import java.io.Serializable;
import java.util.Stack;

public class Calculadora implements Serializable {

	
	private double result;
    private Stack<Double> operandStack;
    private Stack<String> operatorStack;
    
    public Calculadora() {
    	this.result=0;
    	this.operandStack = new Stack<>();
    	this.operatorStack = new Stack<>();
    }
    
    public void performOperation(double operand) {
    	operandStack.push(operand);
    	
    }
    
    public void performOperation(String operation) {
    	while (!operatorStack.isEmpty() && hasPrecedence(operation, operatorStack.peek())) {
    		evaluateExpression();
    	}
    	operatorStack.push(operation);
    }
    
    //GETTERS
    public double getResult() {
    	while (!operatorStack.isEmpty()) {
    		evaluateExpression();
    	}
    	System.out.println("El resultado es: " + result);
    	return result;
    }
	public void setResult(double result) {
		this.result = result;
	}
	public Stack<Double> getOperandStack() {
		return operandStack;
	}
	public void setOperandStack(Stack<Double> operandStack) {
		this.operandStack = operandStack;
	}
	public Stack<String> getOperatorStack() {
		return operatorStack;
	}
	public void setOperatorStack(Stack<String> operatorStack) {
		this.operatorStack = operatorStack;
	}
	
	//


	 
	 private void evaluateExpression() {
	        if (operandStack.size() >= 2 && !operatorStack.isEmpty()) {
	            double operand2 = operandStack.pop();
	            double operand1 = operandStack.pop();
	            String operator = operatorStack.pop();
	            double result = performOperation(operand1, operand2, operator);
	            operandStack.push(result);
	        }
	 }
	 

	 public double performOperation(double operand1, double operand2, String operator) {
	        switch (operator) {
	            case "+":
	                return operand1 + operand2;
	            case "-":
	                return operand1 - operand2;
	            case "*":
	                return operand1 * operand2;
	            case "/":
	                if (operand2 != 0) {
	                    return operand1 / operand2;
	                } else {
	                    System.out.println("Error: División por cero.");
	                    return 0;
	                }
	            default:
	                System.out.println("Operación no válida");
	                return 0;
	        }
	    }
	 
	 private boolean hasPrecedence(String op1, String op2) {
	        return (op2.equals("*") || op2.equals("/")) && (op1.equals("+") || op1.equals("-"));
	 }
	 
}
