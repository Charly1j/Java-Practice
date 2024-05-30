public class Wizard extends Human{
    private final int health;
    private final int intelligence;

    public Wizard() {
        super();
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human target) {
        target.health += this.intelligence;
        System.out.println("¡Curación exitosa! La salud de " + target + " ahora es " + target.health);
    }

    public void fireBall(Human target) {
        target.health -= this.intelligence * 3;
        System.out.println("¡Bola de fuego lanzada! La salud de " + target + " ahora es " + target.health);
    }
}
