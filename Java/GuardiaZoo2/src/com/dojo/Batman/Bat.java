package com.dojo.Batman;

public class Bat extends NewMammal{
	//CONSTRUCTORES
		public Bat(int energyLevel) {
			super(energyLevel);
		}
		public Bat() {
			
		}
		//METODOS
		public void eatHumas() {
			System.out.println("Comió Humanos!!. Bueno, no importa");
			energyLevel += 25;
		}
		public void attackTown() {
			System.out.println("Ciudad en llamas");
			energyLevel -=100;
		}
		public void fly() {
			System.out.println("Despliega sus alas y sobrevuela el area");
			energyLevel -= 50;
		}

}
