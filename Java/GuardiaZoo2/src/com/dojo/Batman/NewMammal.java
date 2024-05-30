package com.dojo.Batman;

public class NewMammal {
	
	//ATRIBUTO DE LA CLASE
		public int energyLevel= 300;
		
		public NewMammal(int energyLevel) {
			this.energyLevel = energyLevel;
		}
		public void displayEnergy() {
			System.out.println("Nivel de Energia: "+ this.energyLevel);
		}
		public NewMammal() {
		// CONSTRUCTOR
			
		}
		//Gett & Sett
		public int getEnergyLevel() {
			return energyLevel;
		}
		public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
		}

}
