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

    public static Armour[] listOptions() {
        Armour[] armourList = new Armour[3];
        armourList[0] = new Armour(1, "Light", 1, 15);
        armourList[1] = new Armour(2, "Medium", 3, 25);
        armourList[2] = new Armour(3, "Heavy", 5, 40);
        return armourList;
    }
}
