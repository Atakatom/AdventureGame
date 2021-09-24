import java.util.Scanner;

public class Player {
    Inventory inv;
    private String name;
    private GameChar characterType;
    private int money;
    private int health;
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
        if (id < 1 || id > GameChar.charList().size()) {
            System.out.println("\nInvalid choice !! Your character will be a Knight as default !!!\n");
            id = 3;
        }
        setCharType(GameChar.charList().get(id - 1));
        setMoney(characterType.getMoney());
        setHealth(characterType.getHealth());
        System.out.println("\nBrave Warrior " + getName() + " Welcome to the Adventure Realm!\n");
        warriorStatus();
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

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public GameChar getCharType() {
        return characterType;
    }

    public void setCharType(GameChar characterType) {
        this.characterType = characterType;
    }

    public void warriorStatus() {
        System.out.println("Your status are: ");
        System.out.println("Name : " + getName() + ", Type : " + characterType.getName() + ", Blocking : "
                + inv.getArmour().getDefence() + " (" + inv.getArmour().getName() + ")" + ", Damage : "
                + characterType.getDamage() + " + " + inv.getWeapon().getDamage() + " (" + inv.getWeapon().getName()
                + ")" + ", Health : " + characterType.getHealth() + ", Money : " + getMoney());
    }

    public void inventoryStatus() {
        System.out.println("Your status are: ");
        System.out.println("Type:   " + characterType.getName() + ", Weapon : " + inv.getWeapon().getName()
                + ", Armour : " + inv.getArmour().getName() + ", Blocking : " + inv.getArmour().getDefence()
                + ", Damage : " + characterType.getDamage() + " + " + inv.getWeapon().getDamage() + ", Health : "
                + characterType.getHealth() + ", Money : " + getMoney());
        System.out.println("Food " + (inv.food ? "obtained" : "null"));
        System.out.println("Firewood " + (inv.firewood ? "obtained" : "null"));
        System.out.println("Water " + (inv.water ? "obtained" : "null"));
    }
}
