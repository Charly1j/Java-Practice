package com.fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner= new Scanner(System.in);
		        
		        System.out.println("Ingresa un numero entero: ");
		        int numero = scanner.nextInt();
		        
		        if (numero % 3 == 0 && numero % 5 == 0) {
		            System.out.println("FizzBuzz");
		        } else if (numero % 3 == 0) {
		            System.out.println("Fizz");
		        } else if (numero % 5 == 0) {
		            System.out.println("Buzz");
		        } else {
		            System.out.println(numero);
		        }

		        scanner.close();
		    }
		
	}
	

