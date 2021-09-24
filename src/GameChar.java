import java.util.ArrayList;

public class GameChar {
    private int id;
    private int damage;
    private int health;
    private int money;
    private String type;

    public GameChar(int id, String type, int damage, int health, int money) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.type = type;
    }

    public static ArrayList<GameChar> charList() {
        ArrayList<GameChar> charList = new ArrayList<>();
        charList.add(new GameChar(1, "Samurai", 5, 21, 15));
        charList.add(new GameChar(2, "Archer", 7, 18, 20));
        charList.add(new GameChar(3, "Knight", 8, 24, 5));
        charList.add(new GameChar(4, "admin", 99, 99, 9999));
        return charList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID : " + getId() + "\t Type : " + getName() + "\t Damage: " + getDamage() + "\t Health: " + getHealth()
                + "\t Money :" + getMoney();
    }
}
