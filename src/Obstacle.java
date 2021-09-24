public class Obstacle {
    private int id;
    private int damage;
    private int health;

    public Obstacle(int id, int damage, int health) {
        this.id = id;
        this.damage = damage;
        this.health = health;
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
}
