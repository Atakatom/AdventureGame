import java.util.Scanner;

public class Player {
    Inventory inv = new Inventory();
    private String name;
    private GameChar characterType;
    boolean warriorIsSummoned = false;
    Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        selectChar();
    }

    public void selectLoc() {
        Location loc;
        System.out.println("\nLocations!");
        System.out.println("-------------------------------------------------------");
        System.out.println("id : 1 - Safe House");
        System.out.println("id : 2 - Tool Store");
        System.out.println("-------------------------------------------------------");
        System.out.print("Write the id of the location would you like to go: ");
        int selectLoc = input.nextInt();
        switch (selectLoc) {
            case 1:
                loc = new SafeHouse(this);
                break;
            case 2:
                loc = new ToolStore(this);
                break;
            default:
                loc = new SafeHouse(this);
        }
        loc.onLocation();
    }

    protected void selectChar() {
        if (!warriorIsSummoned) {
            System.out.println("Just so you know the journey ahaed of you is not meant for the shilly-shally");
            System.out.println("Now your first action to choose is how to define yourself in the battlefield...");
            GameChar[] charList = { new Samurai(), new Archer(), new Knight() };
            System.out.println("-------------------------------------------------------");
            while (!warriorIsSummoned) {
                int a = 1;
                for (GameChar i : charList) {
                    System.out.println("id : " + a + " " + i.toString());
                    a++;
                }
                System.out.println("-------------------------------------------------------");
                System.out.print("Write the ID of the character you want to choose: ");
                warriorIsSummoned = true;
                // try {
                int id = input.nextInt();
                switch (id) {
                    case 1:
                        characterType = new Samurai();
                        break;
                    case 2:
                        characterType = new Archer();
                        break;
                    case 3:
                        characterType = new Knight();
                        break;
                    default:
                        System.out.println("YOU IMPUDENT!! DO YOU TAKE ME AS A FOOL!!!\n"
                                + "THIS IS NO PLACE FOR SUCH JOKES, BE SERIOUS AND WRITE THE ID OF YOUR CHARACTER:");
                        warriorIsSummoned = false;
                }
                // } catch (Exception e) {
                // System.out.println("YOU IMPUDENT!! DO YOU TAKE ME AS A FOOL!!!\n"
                // + "THIS IS NO PLACE FOR SUCH JOKES, BE SERIOUS AND WRITE THE ID OF YOUR
                // CHARACTER:");
                // warriorIsSummoned = false;
                // }
            }
        } else {
            System.out.print("WHAT KIND OF AND IDIOT ARE YOU FOR NOT REALIZING THAT YOU ALREADY EXIST!!!");
        }
    }

    public String getName() {
        return this.name;
    }

    public void warriorStatus() {
        System.out.println("Type:   " + characterType.getType());
        System.out.println("Health: " + characterType.getHealth());
        System.out.println("Damage: " + characterType.getDamage() + " + " + inv.weaponDamage);
    }

    public void inventoryStatus() {
        System.out.println("Money : " + characterType.getMoney());
        System.out.println("Food " + (inv.food ? "obtained" : "null"));
        System.out.println("Firewood " + (inv.firewood ? "obtained" : "null"));
        System.out.println("Water " + (inv.water ? "obtained" : "null"));
    }
}
