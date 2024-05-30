public class Ninja extends Human{
    private final int stealth;

    public Ninja() {
        super();
        this.stealth = 10;
    }

    public void steal(Human target) {
        int stolenHealth = this.stealth;
        target.health -= stolenHealth;
        this.health += stolenHealth;
        System.out.println("¡Robo exitoso! Se han robado " + stolenHealth + " puntos de salud.");
    }

    public void runAway() {
        this.health -= 10;
        System.out.println("¡Huida exitosa! Se ha reducido la salud del Ninja.");
    }

    //Get & Sett

}
