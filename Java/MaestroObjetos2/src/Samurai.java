public class Samurai extends Human {
    public Samurai() {
        super();
        this.health = 200;
    }

    public void deathBlow(Human target) {
        target.health = 0;
        this.health /= 2;
        System.out.println("¡Golpe mortal! La salud de " + target + " ahora es 0 y la salud del Samurai se reduce a " + this.health);
    }

    public void meditate() {
        this.health += this.health / 2;
        System.out.println("¡Meditación realizada! La salud del Samurai ha aumentado.");
    }

    public int howMany() {
        return Samurai.this.health;
    }
}
