import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    Player player;
    Location location;

    public void start() {
        System.out.println("Welcome to the Adventure Game !");
        System.out.print("Give us your name : ");
        String playerName = input.nextLine();
        player = new Player(playerName);
        System.out.println("Brave Warrior " + player.getName() + " Welcome to the Adventure Realm!");
        while (true) {
            Location loc;
            System.out.println("\n################\tLocations\t################\n");
            System.out.println("-------------------------------------------------------\n");
            System.out.println("id : 1 - Safe House --> There are no enemies to harm you in here !");
            System.out.println("id : 2 - Tool Store --> You can buy Weapon or Armour");
            System.out.println("\n-------------------------------------------------------");
            System.out.print("Write the id of the location would you like to go: ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    loc = new SafeHouse(player);
                    break;
                case 2:
                    loc = new ToolStore(player);
                    break;
                default:
                    loc = new SafeHouse(player);
            }
            if (!loc.onLocation()) {
                System.out.println("GAME OVER !!!");
                break;
            }
        }
    }
}
