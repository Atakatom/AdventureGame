import java.util.ArrayList;

public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;

    public Obstacle(int id, String name, int damage, int health) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
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

    public void setHealth(int health) {
        this.health = health;
    }

    public static ArrayList<Obstacle> getMonsters() {
        ArrayList<Obstacle> monsters = new ArrayList<>();
        monsters.add(new Obstacle(1, "Zombie", 3, 10));
        monsters.add(new Obstacle(2, "Vampire", 4, 14));
        monsters.add(new Obstacle(3, "Bear", 7, 20));
        return monsters;
    }
}
