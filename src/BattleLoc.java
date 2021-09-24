import java.util.Random;

public class BattleLoc extends Location {
    private Obstacle obstacle;
    private int numOfObs;

    public BattleLoc(Player player, String name, Obstacle obstacle) {
        super(player, name);
        this.obstacle = obstacle;

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
        numOfObs = rand.nextInt(2) + 1;
        while (numOfObs > 0) {
            System.out.println("\n----------------------------------------------\n");
            System.out.println("WATCH OUT !!! There are " + numOfObs + " of them!");
        }
        return true;
    }

    public void combat() {

    }
}
