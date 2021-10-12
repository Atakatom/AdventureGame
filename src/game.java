import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    Player player;
    Location location;

    public void start() {
        System.out.println("Welcome to the Adventure Game !");
        // System.out.print("Give us your name : ");
        // String playerName = input.nextLine();
        player = new Player("atakan");
        while (true) {
            System.out.println("\n################\tLocations\t################\n");
            System.out.println("-------------------------------------------------------\n");
            System.out.println("ID : 0 - EXIT GAME");
            System.out.println("ID : 1 - Safe House --> There are no enemies to harm you in here !");
            System.out.println("ID : 2 - Tool Store --> You can buy Weapon or Armour");
            System.out.println("ID : 3 - Cave       --> Your award will be FOOD     but only if you survive >:)");
            System.out.println("ID : 4 - Forest     --> Your award will be FIREWOOD but only if you survive >:)");
            System.out.println("ID : 5 - River      --> Your award will be WATER    but only if you survive >:)");
            System.out.println("\n-------------------------------------------------------");
            System.out.print("Write the id of the location would you like to go: ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);

            }
            boolean exit = location.onLocation();
            if (!exit || selectLoc == 0) {
                System.out.println("GAME OVER !!!");
                break;
            }
            player.warriorStatus();
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
