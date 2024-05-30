package com.dojo.calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora myCalculator = new Calculadora();
	
		myCalculator.setOperandOne(20);
        myCalculator.setOperation("-");
        myCalculator.setOperandTwo(5.2);
        
        myCalculator.performOperation();
        
        myCalculator.getResult();
	}

}
