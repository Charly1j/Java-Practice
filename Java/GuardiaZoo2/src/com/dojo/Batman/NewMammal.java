package com.dojo.Batman;

public class NewMammal {
	
	//ATRIBUTO DE LA CLASE
		public int energyLevel= 300;
		
		// CONSTRUCTOR
		public NewMammal() {
			
		}
		public NewMammal(int energyLevel) {
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
