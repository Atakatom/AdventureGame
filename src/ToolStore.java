public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Shop");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n################\tTool Store\t################\n");
        boolean loop = true;
        while (loop) {
            System.out.println("-------------------------------------------------------\n");
            System.out.println("id : 1 - Weapon --> is an addition to your base damage !");
            System.out.println("id : 2 - Armour --> partionally cancel the damage of your opponent in each turn !");
            System.out.println("id : 3 - EXIT !");
            System.out.println("\n-------------------------------------------------------");
            System.out.print("Write the id of the type of item you would like to choose: ");
            switch (input.nextInt()) {
                case 1:
                    printWeapon();
                    loop = false;
                    break;
                case 2:
                    printArmour();
                    loop = false;
                    break;
                case 3:
                    System.out.println("Hope to see you soon !");
                    loop = false;
                    break;
                default:
                    System.out.println("You seem to be mistaken sir please choice wisely");
                    break;
            }
        }
        input.close();
        return true;
    }

    public void printWeapon() {
        System.out.println("WEAPON    ID    DAMAGE    COST");
        System.out.println("CrossBow  1     2         25");
        System.out.println("Wand      2     3         35");
        System.out.println("Sword     3     7         45");
    }

    public void printArmour() {
        System.out.println("ARMOUR    ID    DEFENCE   COST");
        System.out.println("Light     1     1         15");
        System.out.println("Medium    2     3         25");
        System.out.println("Heavy     3     5         40");
    }

    public void buy() {

    }
}
