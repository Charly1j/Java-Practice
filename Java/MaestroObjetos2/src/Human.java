public class Human {
    private int strength;
    private int intelligence;
    private int stealth;
    int health;

    public Human() {
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.health = 100;
    }

    public void attack(Human target) {
        target.health -= this.strength;
        System.out.println("¡Ataque exitoso! La salud de " + target + " ahora es " + target.health);
    }

    //Constructor

    public Human(int strength, int intelligence, int stealth, int health) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
    }


    //Get & Sett

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
