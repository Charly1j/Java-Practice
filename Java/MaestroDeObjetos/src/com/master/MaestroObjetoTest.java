package com.master;

import com.players.Ninja;
import com.players.Samurai;
import com.players.Wizard;

public class MaestroObjetoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wizard mago =new Wizard();
		Ninja bill = new Ninja();
		Samurai samu = new Samurai();
		
		bill.attack(samu);
		System.out.println(samu.getHealth());
		System.out.println(mago.getStrength());
	}

}
