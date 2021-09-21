public class Weapon extends Tool {
    private int damage;

    public Weapon(int id, String name, int damage, int price) {
        super(id, name, price);
        this.damage = damage;
    }

    public static Weapon defaultWeapon() {
        return new Weapon(0, "naked", 0, 0);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static Weapon[] listOptions() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(1, "CrossBow", 2, 25);
        weaponList[1] = new Weapon(2, "Wand", 3, 35);
        weaponList[2] = new Weapon(3, "Sword", 7, 45);
        return weaponList;
    }

    public static Weapon pickWeaponByID(int id) {
        for (Weapon w : Weapon.listOptions()) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }
}
