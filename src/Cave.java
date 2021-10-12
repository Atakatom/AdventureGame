
public class Cave extends BattleLoc {
    static int monsterID = 0;
    static {
        for (int i = 0; i < Obstacle.getMonsters().size(); i++) {
            if (Obstacle.getMonsters().get(i).getName().toLowerCase().equals("zombie"))
                monsterID = i;
        }
    }

    public Cave(Player player) {

        super(player, "Cave", Obstacle.getMonsters().get(monsterID));
    }
}
