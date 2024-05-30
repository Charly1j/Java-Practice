package gorila;

public class Mammal {

	//ATRIBUTO DE LA CLASE
	public int energyLevel= 100;
	
	// CONSTRUCTOR
	public Mammal() {
		
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public void displayEnergy() {
		System.out.println("Nivel de Energia: "+ this.energyLevel);
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
