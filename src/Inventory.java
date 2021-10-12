import java.util.HashSet;

public class Inventory {
    HashSet<String> rewards = new HashSet<>();
    Weapon weapon;
    Armour armour;

    public Inventory() {
        weapon = Weapon.defaultWeapon();
        armour = Armour.defaultArmour();
    }

    public void gainReward(String s) {
        rewards.add(s);
        System.out.println(s + " is added to your collection of rewards!");
    }

    public void getRewards() {
        if (rewards.size() > 0) {
            System.out.println("\nThe rewards you gained through your adventures are : ");
            for (String s : rewards) {
                System.out.println(s + " is already obtained.");
            }
        } else {
            System.out.println(
                    "\nYou haven't gained any rewards yet! If you want to get some reward then go to an adventure!\n");
        }
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void weaponStatus() {
        System.out.println("Name of your weapon is: " + weapon.getName() + "\n" + "The damage your weapon can hit is: "
                + weapon.getDamage());
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
