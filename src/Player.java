import java.util.Scanner;

public class Player {
    Inventory inv;
    private String name;
    private GameChar characterType;
    private int money;
    Scanner input = new Scanner(System.in);

    public Player(String name) {
        inv = new Inventory();
        this.name = name;
        selectChar();
    }

    protected void selectChar() {
        System.out.println("Just so you know the journey ahaed of you is not meant for the shilly-shally");
        System.out.println("Now your first action to choose is how to define yourself in the battlefield...");
        System.out.println("\n################\tCharacters\t################\n");
        System.out.println("-------------------------------------------------------\n");
        for (GameChar i : GameChar.charList()) {
            System.out.println(i.toString());
        }
        System.out.println("\n-------------------------------------------------------\n");
        System.out.print("Write the ID of the character you want to choose: ");
        int id = input.nextInt();
        if (id < 1 || id > GameChar.charList().length) {
            System.out.println("\nInvalid choice !! Your character will be a Knight as default !!!\n");
            id = 3;
        }
        characterType = GameChar.charList()[id - 1];
        money = characterType.getMoney();
        System.out.println("\nYour character type is " + characterType.getName() + "\n");
    }

    public Inventory getInv() {
        return inv;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return money;
    }

    public void warriorStatus() {
        System.out.println("Type:   " + characterType.getName());
        System.out.println("Health: " + characterType.getHealth());
        System.out.println("Damage: " + characterType.getDamage() + " + " + inv.getWeapon());
    }

    public void inventoryStatus() {
        System.out.println("Money : " + getMoney());
        System.out.println("Food " + (inv.food ? "obtained" : "null"));
        System.out.println("Firewood " + (inv.firewood ? "obtained" : "null"));
        System.out.println("Water " + (inv.water ? "obtained" : "null"));
    }
}
