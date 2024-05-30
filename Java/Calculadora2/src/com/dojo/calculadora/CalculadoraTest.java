package com.dojo.calculadora;

public class CalculadoraTest {
	
	public static void main(String[] args) {
		Calculadora myCalculator = new Calculadora();

        // Realizar operaciones
        myCalculator.performOperation(10.5);
        myCalculator.performOperation("+");
        myCalculator.performOperation(5.2);
        myCalculator.performOperation("*");
        myCalculator.performOperation(10);
        
        // Obtener el resultado
        myCalculator.getResult();
    }
}
