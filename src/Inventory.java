public class Inventory {
    boolean water, food, firewood;
    String weaponName, armorName;
    int weaponDamage, armorDefence;

    public Inventory() {
        water = false;
        food = false;
        firewood = false;
        weaponName = "barehanded";
        armorName = "naked";
        weaponDamage = 0;
        armorDefence = 0;
    }

    public boolean doWeHaveWater() {
        return water;
    }

    public void weGainedWater(){
        water = true;
        System.out.println("Water is added to your inventory...")
    }

    public boolean doWeHaveFood() {
        return food;
    }

    public void weGainedFood(){
        food = true;
        System.out.println("Food is added to your inventory...")
    }

    public boolean doWeHaveFirewood() {
        return firewood;
    }

    public void weGainedFirewood(){
        firewood = true;
        System.out.println("Firewood is added to your inventory...")
    }
}
