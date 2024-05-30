public class HumanTest {
    public static void main(String[] args) {
        Human player1 = new Human();
        Human player2 = new Human();

        System.out.println("Salud de jugador 1 antes del ataque: " + player1.getHealth());
        System.out.println("Salud de jugador 2 antes del ataque: " + player2.getHealth());

        player1.attack(player2);

        System.out.println("Salud de jugador 1 después del ataque: " + player1.getHealth());
        System.out.println("Salud de jugador 2 después del ataque: " + player2.getHealth());


    }
}
