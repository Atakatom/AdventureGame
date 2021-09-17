import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    Player player;
    Location location;

    Game() {
        player = new Player();
    }

    public void start() {
        System.out.println("Welcome to the Adventure Game !");
        System.out.println("WELCOME! BRAVE WARRIOR..");
        System.out.print("Give us your name : ");
        String playerName = input.nextLine();

    }

}
