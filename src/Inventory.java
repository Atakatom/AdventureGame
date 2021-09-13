public class Inventory {
    boolean water, food, firewood;
    String weaponName, armourName;
    int weaponDamage, armourDefence;

    public Inventory() {
        water = false;
        food = false;
        firewood = false;
        weaponName = "barehanded";
        armourName = "naked";
        weaponDamage = 0;
        armourDefence = 0;
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

    public void newWeapon(String weaponName, int weaponDamage) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
    }

    public void weaponStatus() {
        System.out.println(
                "Name of your weapon is: " + weaponName + "\n" + "The damage your weapon can hit is: " + weaponDamage);
    }

    public void newArmour(String armourName, int armourDefence) {
        this.armourName = armourName;
        this.armourDefence = armourDefence;
    }

    public void armourStatus() {
        System.out.println("Name of your armour is: " + armourName + "\n" + "The damage your armour can absorb is: "
                + armourDefence);
    }
}
