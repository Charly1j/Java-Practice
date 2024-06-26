package com.master;

public class Human {
	
	// 4 PROPIEDADES - AKA ATRIBUTOS DE CLASE
	
	protected int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	//CONSTRUCTOR
	public Human() {}
	public Human(int fuerza) {
		this.strength = fuerza;
	}
	
	public void attack(Human target) {
		target.health -=this.strength;
	}
	
	//GETTERS Y SETTERS
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}


}
