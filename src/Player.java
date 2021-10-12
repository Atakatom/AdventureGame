import java.util.Scanner;
import java.util.Random;

public class Player {
    Inventory inv;
    private String name;
    private GameChar characterType;
    private int money;
    private int health;
    Scanner input = new Scanner(System.in);

    public Player(String name) throws Exception {
        inv = new Inventory();
        this.name = name;
        selectChar();
    }

    protected void selectChar() throws Exception {
        StringBuilder str = new StringBuilder();
        str.append("Just so you know the journey ahaed of you is not meant for the shilly-shally");
        str.append("\nNow your first action to choose is how to define yourself in the battlefield...\n");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            Thread.sleep(50);
        }
        str = new StringBuilder();
        str.append("\n################\tCharacters\t################\n\n");
        str.append("-------------------------------------------------------\n\n");
        for (GameChar i : GameChar.charList()) {
            if (!i.getName().toLowerCase().equals("admin"))
                str.append(i.toString() + "\n");
        }
        str.append("\n-------------------------------------------------------\n\n");
        str.append("Write the ID of the character you want to choose: ");
        for (char k : str.toString().toCharArray()) {
            System.out.print(k);
            Thread.sleep(40);
        }
        int id = input.nextInt();
        if (id < 0 || id > GameChar.charList().size() - 1) {
            System.out.println("\nInvalid choice !! Your character will be a chosen randomly!!!\n");
            Random rand = new Random();
            id = rand.nextInt(3) + 1;
        }
        setCharType(GameChar.charList().get(id));
        setMoney(characterType.getMoney());
        setHealth(characterType.getHealth());
        System.out.println("Brave Warrior " + getName() + " Welcome to the Adventure Realm!\n");
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

    public int getDamage() {
        return characterType.getDamage() + inv.getWeapon().getDamage();
    }

    public void warriorStatus() {
        System.out.println("\nYour status are: ");
        System.out.println("Name : " + getName() + ", Type : " + characterType.getName() + ", Blocking : "
                + inv.getArmour().getDefence() + " (" + inv.getArmour().getName() + ")" + ", Damage : "
                + characterType.getDamage() + " + " + inv.getWeapon().getDamage() + " (" + inv.getWeapon().getName()
                + ")" + ", Health : " + getHealth() + ", Money : " + getMoney());
    }

    public void inventoryStatus() {
        System.out.println("\nYour status are: ");
        System.out.println("Type:   " + characterType.getName() + ", Weapon : " + inv.getWeapon().getName()
                + ", Armour : " + inv.getArmour().getName() + ", Blocking : " + inv.getArmour().getDefence()
                + ", Damage : " + characterType.getDamage() + " + " + inv.getWeapon().getDamage() + ", Health : "
                + characterType.getHealth() + ", Money : " + getMoney());
        inv.getRewards();
    }
}
