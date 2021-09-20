public abstract class GameChar {
    private int damage;
    private int health;
    private int money;
    private String type;

    public GameChar(String type, int damage, int health, int money) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.type = type;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getType() + "\t Damage: " + getDamage() + "\t Health: " + getHealth() + "\t Money :" + getMoney();
    }
}
