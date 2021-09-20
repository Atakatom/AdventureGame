public class Weapon extends Tool {
    private int damage;

    public Weapon(int id, String name, int damage, int price) {
        super(id, name, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Tool[] listOptions() {
        Tool[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(1, "CrossBow", 2, 25);
        weaponList[1] = new Weapon(2, "Wand", 3, 35);
        weaponList[2] = new Weapon(3, "Sword", 7, 45);
        return weaponList;
    }
}
