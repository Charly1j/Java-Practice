package gorila;

public class Gorila extends Mammal{
	
	//CONSTRUCTORES
	public Gorila(int energyLevel) {
		super(energyLevel);
	}
	public Gorila() {
		
	}
	//METODOS
	public void eatBanana() {
		System.out.println("mmm, Bababas,Yummy");
		energyLevel += 10;
	}
	public void throwSomething() {
		System.out.println("Lanzar cosas");
		energyLevel -=5;
	}
	public void climb() {
		System.out.println("Trepadando arbol");
		energyLevel -= 10;
	}
}
