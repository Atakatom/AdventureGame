public class Inventory {
    boolean water;
    boolean food;
    boolean firewood;
    Weapon weapon;
    Armour armour;

    public Inventory() {
        water = false;
        food = false;
        firewood = false;
        weapon = Weapon.defaultWeapon();
        armour = Armour.defaultArmour();
    }

    public boolean doWeHaveWater() {
        return water;
    }

    public void weGainedWater() {
        water = true;
        System.out.println("Water is added to your inventory...");
    }

    public boolean doWeHaveFood() {
        return food;
    }

    public void weGainedFood() {
        food = true;
        System.out.println("Food is added to your inventory...");
    }

    public boolean doWeHaveFirewood() {
        return firewood;
    }

    public void weGainedFirewood() {
        firewood = true;
        System.out.println("Firewood is added to your inventory...");
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void weaponStatus() {
        System.out.println("Name of your weapon is: " + weapon.getName() + "\n" + "The damage your weapon can hit is: "
                + weapon.getDamage());
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public void armourStatus() {
        System.out.println("Name of your armour is: " + armour.getName() + "\n"
                + "The damage your armour can absorb is: " + armour.getDefence());
    }

    public Armour getArmour() {
        return armour;
    }
}
