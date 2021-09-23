public class Armour extends Tool {
    private int defence;

    public Armour(int id, String name, int defence, int price) {
        super(id, name, price);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public static Armour defaultArmour() {
        return new Armour(0, "naked", 0, 0);
    }

    public static Armour[] listOptions() {
        Armour[] armourList = new Armour[3];
        armourList[0] = new Armour(1, "Light Armour", 1, 15);
        armourList[1] = new Armour(2, "Medium Armour", 3, 25);
        armourList[2] = new Armour(3, "Heavy Armour", 5, 40);
        return armourList;
    }

    public static Armour pickArmourByID(int id) {
        for (Armour a : Armour.listOptions()) {
            if (a.getId() == id)
                return a;
        }
        return null;
    }
}