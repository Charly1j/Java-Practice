package com.dojo.cuentabanco.principal;

import com.dojo.cuentabanco.archivos.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount cuenta1= new BankAccount();
		cuenta1.depositarDinero(500.00, "ahorros");
		cuenta1.depositarDinero(7.00, "ahorros");
		System.out.println("TOTAL SALDO: "+ cuenta1.getSaldoCuentaAhorro());
		
		
		BankAccount cuenta2= new BankAccount();
		System.out.println(cuenta1.getNumeroCuenta());
		System.out.println(cuenta2.getNumeroCuenta());
		System.out.println("Total numeros cuenta: "+ +BankAccount.getTotalCuentas());
	}

}
