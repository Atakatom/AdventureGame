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
                    Weapon weapon = buyWeapon();
                    if (weapon != null) {
                        super.getPlayer().getInv().setWeapon(weapon);
                        System.out.println("\nConguratulations!!! You have obtained "
                                + super.getPlayer().getInv().getWeapon().getName());
                    }
                    loop = false;

                    break;
                case 2:
                    printArmour();
                    Armour armour = buyArmour();
                    if (armour != null) {
                        super.getPlayer().getInv().setArmour(armour);
                        System.out.println("\nConguratulations!!! You have obtained "
                                + super.getPlayer().getInv().getArmour().getName());
                    } else {
                    }
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
            System.out.println("id : " + w.getId() + " - " + w.getName() + "\tDamage: " + w.getDamage() + "\tPrice: "
                    + w.getPrice());
        }
        System.out.println("Your money : " + super.getPlayer().getMoney());
    }

    public Weapon buyWeapon() {
        System.out.print("(0-for Exit)\nChoose a weapon: ");
        int weaponID = input.nextInt();
        while (weaponID < 0 || weaponID > Weapon.listOptions().length) {
            System.out.print("\nInvalid choice! Enter again : ");
            weaponID = input.nextInt();
        }
        if (weaponID != 0) {
            int playersMoney = super.getPlayer().getMoney();
            Weapon selectedWeapon = Weapon.listOptions()[weaponID - 1];
            if (playersMoney < selectedWeapon.getPrice()) {
                printPoorMan(selectedWeapon, playersMoney);
                return null;
            }
            return selectedWeapon;
        }
        return null;
    }

    public void printArmour() {
        System.out.println("\n--------Armours--------\n");
        for (Armour a : Armour.listOptions()) {
            System.out.println("id : " + a.getId() + " - " + a.getName() + "\tDefence: " + a.getDefence() + "\tPrice: "
                    + a.getPrice());
        }
        System.out.println("Your money : " + super.getPlayer().getMoney());
    }

    public Armour buyArmour() {
        System.out.print("(0-for Exit)\nChoose an armour: ");
        int armourID = input.nextInt();
        while (armourID < 0 || armourID > Armour.listOptions().length) {
            System.out.println("Invalid choice! Enter again : ");
            armourID = input.nextInt();
        }
        if (armourID != 0) {
            int playersMoney = super.getPlayer().getMoney();
            Armour selectedArmour = Armour.listOptions()[armourID - 1];
            if (playersMoney < selectedArmour.getPrice()) {
                printPoorMan(selectedArmour, playersMoney);
                return null;
            }
            return selectedArmour;
        }
        return null;
    }

    public void printPoorMan(Tool tool, int playersMoney) {
        System.out.println("\nYou don't have enough money for that !\nYour money: " + playersMoney + "\tPrice of "
                + tool.getName() + " is :" + tool.getPrice() + "\n");
        System.out.println("DON'T COME HERE UNLESS YOU HAVE MONEY !!!");
    }

}
