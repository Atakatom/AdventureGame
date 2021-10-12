import java.util.Random;

public class BattleLoc extends Location {
    private String reward;
    private Obstacle obstacle;
    private int numOfObs;

    public BattleLoc(Player player, String name, Obstacle obstacle, String reward) {
        super(player, name);
        this.obstacle = obstacle;
        this.reward = reward;

    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public boolean onLocation() {
        System.out.println("Brave Warrior " + super.getPlayer().getName() + " you are in : " + getName() + " !");
        System.out.println("Be careful !! In here you can come up to " + obstacle.getName() + " anytime!");
        Random rand = new Random();
        numOfObs = rand.nextInt(3) + 1;
        while (numOfObs > 0) {
            System.out.println("\n----------------------------------------------\n");
            System.out.println("WATCH OUT !!! There are " + numOfObs + " of them!");
            System.out.print("\nFight! (Y) or Run! (N) : ");
            String choice = input.nextLine().trim().toLowerCase();
            if (choice.equals("y")) {
                System.out.println(
                        "\n----------------------------------------------------------------------------------------------------------\n");
                return combat(numOfObs);

            } else {
                System.out.println("YOU COWARD !!");
                break;
            }
        }
        return true;
    }

    public boolean combat(int numOfObs) {
        System.out.printf("Your Health : %-5sDamage : %-5sBlocking : %-12sVS%12s", this.getPlayer().getHealth(),
                this.getPlayer().getDamage(), this.getPlayer().getInv().getArmour().getDefence(), "");
        System.out.printf("%s%-5dHealth : %-5dDamage : %-5d%n", obstacle.getName(), 1, obstacle.getHealth(),
                obstacle.getDamage());
        for (int k = 1; k < numOfObs; k++) {
            System.out.printf("%70s%s%-5dHealth : %-5dDamage : %-5d%n", "", obstacle.getName(), k + 1,
                    obstacle.getHealth(), obstacle.getDamage());
        }
        System.out.println("");
        Obstacle[] enemies = new Obstacle[numOfObs];
        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = Obstacle.getMonsters().get(this.obstacle.getID() - 1);
            while (enemies[i].getHealth() > 0) {
                System.out.printf("Your hit caused%2s damage%-13s", this.getPlayer().getDamage(), "");
                enemies[i].setHealth(enemies[i].getHealth() - this.getPlayer().getDamage());
                if (enemies[i].getHealth() < 0) {
                    System.out.printf("%s%d is killed!!%-14sRemaining enemies are : %s%n", this.obstacle.getName(),
                            i + 1, "", enemies.length - i - 1);
                    if (enemies.length - i - 1 == 0) {
                        System.out.println("\n************************************\tTHE " + this.getName().toUpperCase()
                                + " IS CLEARED\t************************************\n");
                        System.out.println(
                                "\n----------------------------------------------------------------------------------------------------------\n");
                        this.getPlayer().getInv().gainReward(this.getReward());
                        return true;
                    }
                } else
                    System.out.printf("Health of %s%d is : %s%n", this.obstacle.getName(), i + 1,
                            enemies[i].getHealth());
                System.out.printf("Enemies hit caused%2s damage%-10s", enemies[i].getDamage(), "");
                this.getPlayer().setHealth(this.getPlayer().getHealth() - enemies[i].getDamage());
                if (this.getPlayer().getHealth() < 0) {
                    System.out.println("You fainted!!");
                    return false;
                } else
                    System.out.printf("Your remaining health is: %s%n", this.getPlayer().getHealth());
            }
        }
        return true;
    }
}
