import java.util.Scanner;

public class Player {
    Inventory inv = new Inventory();
    int damage, health, money;
    String name, type;
    boolean warriorIsSummoned = false;

    public Player() {
        selectChar();
    }

    protected void selectChar() {
        if (!warriorIsSummoned) {
            System.out.println(
                    "WELCOME! BRAVE WARRIOR.. \n Announce your name so the whole world could shake from your might!!");
            Scanner input = new Scanner(System.in);
            this.name = input.nextLine();
            System.out.println("Just so you know the journey ahaed of you is not meant for the shilly-shally");
            System.out.println("Now your first action to choose is how you define yourself in battlefield...");
            while (!warriorIsSummoned) {
                System.out.println("Character   ID    DAMAGE    HEALTH    MONEY");
                System.out.println(" Samurai    1      5         21        15");
                System.out.println(" Archer     2      7         18        20");
                System.out.println(" Knight     3      8         24        5");
                System.out.print("Write the ID of the character you want to choose: ");
                int id = input.nextInt();
                warriorIsSummoned = true;
                switch (id) {
                    case 1:
                        type = "Samurai";
                        damage = 5;
                        health = 21;
                        money = 15;
                        break;
                    case 2:
                        type = "Archer";
                        damage = 7;
                        health = 18;
                        money = 20;
                        break;
                    case 3:
                        type = "Knight";
                        damage = 8;
                        health = 24;
                        money = 5;
                        break;
                    default:
                        System.out.print("YOU IMPUDENT!! DO YOU TAKE ME AS A FOOL!!!\n"
                                + "THIS IS NO PLACE FOR SUCH JOKES, BE SERIOUS AND WRITE THE ID OF YOUR CHARACTER:");
                        warriorIsSummoned = false;
                        break;
                }
                input.close();
            }
        } else {
            System.out.print("WHAT KIND OF AND IDIOT ARE YOU FOR NOT REALIZING THAT YOU ALREADY EXIST!!!");
        }
    }

    public String name() {
        return this.name;
    }

    public void warriorStatus() {
        System.out.println("Type:   " + type);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage + " + " + inv.weaponDamage);
    }

    public void inventoryStatus() {
        System.out.println("Money : " + money);
        System.out.println("Food " + (inv.food ? "obtained" : "null"));
        System.out.println("Firewood " + (inv.firewood ? "obtained" : "null"));
        System.out.println("Water " + (inv.water ? "obtained" : "null"));
    }
}
