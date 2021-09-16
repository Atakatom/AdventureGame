import java.util.Scanner;

public class ToolStore extends NormalLoc {
    @Override
    public boolean onLocation() {
        return true;
    }

    @Override
    void location() {
        // TODO Auto-generated method stub
    }

    public void menu() {
        System.out.println("Welcome traveller, I have the best staff in the whole town.");
        System.out.println("What would you like to buy?");
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.print("(1)-for Weapon (2)-for Armour: ");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("WEAPON    ID    DAMAGE    COST");
                    System.out.println("CrossBow  1     2         25");
                    System.out.println("Wand      2     3         35");
                    System.out.println("Sword     3     7         45");
                    loop = false;
                    break;
                case 2:
                    System.out.println("ARMOUR    ID    DEFENCE   COST");
                    System.out.println("Light     1     1         15");
                    System.out.println("Medium    2     3         25");
                    System.out.println("Heavy     3     5         40");
                    loop = false;
                    break;
                default:
                    System.out.println("You seem to be mistaken sir please choice wisely");
                    break;
            }
        }
        input.close();
    }

    public void buy() {

    }
}
