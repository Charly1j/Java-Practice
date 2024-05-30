package com.dojo.cuentabanco.archivos;

import java.util.Random;

public class BankAccount {
	
	private String numeroCuenta;
	private double saldoCuenta;
	static private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	private static int totalCuentas;
	
	//CONSTRUCTORESS
	public BankAccount() {
		this.numeroCuenta = this.numeroAleatorio();
		this.totalCuentas += 1;
	}

	//METODO PRIVADO QUE RETORNE UN NUMERO DE 10 DIGITOS ALEATORIOS PARA EL NUMMERO DE CUENTA.
	private String numeroAleatorio() {
		String identificacion="";
		Random aleatorio = new Random();
		for(int i=0; i<10; i++) {
			identificacion +=aleatorio.nextInt(10);
		}
		return identificacion;
	}
	
	public void depositarDinero(double cantidad, String tipoCuenta) {
		if(tipoCuenta.equals("ahorros")) {
			this.saldoCuentaAhorro += cantidad;
			this.saldoCuenta += cantidad;
		}else if(tipoCuenta.equals("coriiente")) {
			this.saldoCuentaCorriente += cantidad;
			this.saldoCuenta += cantidad;
		}
		
	}
	
	
	
	
	
	
	//GETTERS ADN SETTERS
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}

	public static int getTotalCuentas() {
		return totalCuentas;
	}

	public static void setTotalCuentas(int totalCuentas) {
		BankAccount.totalCuentas = totalCuentas;
	}
}
