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
        return true;
    }

    public void printWeapon() {
        System.out.println("\n--------Weapons--------\n");
        for (Weapon w : Weapon.listOptions()) {
            System.out.println(
                    w.getId() + " - " + w.getName() + "\tDamage: " + w.getDamage() + "\tPrice: " + w.getPrice());
        }
    }

    public void printArmour() {
        System.out.println("\n--------Armours--------\n");
        for (Armour a : Armour.listOptions()) {
            System.out.println(
                    a.getId() + " - " + a.getName() + "\tDefence: " + a.getDefence() + "\tPrice: " + a.getPrice());
        }
    }

    public void buy() {

    }
}
