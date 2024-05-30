public class GameScenary {
    public static void main(String[] args) {
        // Crear diferentes tipos de personajes
        Wizard wizard = new Wizard();
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        Human human = new Human();

        // Mostrar el estado inicial de cada personaje
        System.out.println("Estado inicial:");
        System.out.println("Wizard: Salud=" + wizard.getHealth() + ", Inteligencia=" + wizard.getIntelligence());
        System.out.println("Ninja: Salud=" + ninja.getHealth() + ", Sigilo=" + ninja.getStealth());
        System.out.println("Samurai: Salud=" + samurai.getHealth());
        System.out.println("Human: Salud=" + human.getHealth());

        // Realizar algunos ataques
        System.out.println("\n¡Comienza la batalla!");

        // El Wizard lanza una bola de fuego al Ninja
        wizard.fireBall(ninja);
        // El Ninja roba salud al Samurai
        ninja.steal(samurai);
        // El Samurai realiza un golpe mortal al Wizard
        samurai.deathBlow(wizard);
        // El Human ataca al Samurai
        human.attack(samurai);
        // El Samurai medita
        samurai.meditate();

        // Mostrar el estado final de cada personaje
        System.out.println("\nEstado final:");
        System.out.println("Wizard: Salud=" + wizard.getHealth());
        System.out.println("Ninja: Salud=" + ninja.getHealth());
        System.out.println("Samurai: Salud=" + samurai.getHealth());
        System.out.println("Human: Salud=" + human.getHealth());
    }
}
