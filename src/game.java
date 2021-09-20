/// import java.util.Scanner;

public class Game {
    // private Scanner input = new Scanner(System.in);
    Player player;
    Location location;

    Game() {

    }

    public void start() {
        System.out.println("Welcome to the Adventure Game !");
        System.out.print("Give us your name : ");
        // String playerName = input.nextLine();
        player = new Player(/* playerName */"atakan");
        System.out.println("Brave Warrior " + player.getName() + " Welcome to the Adventure Realm!");
        player.selectLoc();
    }

}
