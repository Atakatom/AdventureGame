public class Forest extends BattleLoc {
    static int monsterID = 0;
    static {
        for (int i = 0; i < Obstacle.getMonsters().size(); i++) {
            if (Obstacle.getMonsters().get(i).getName().toLowerCase().equals("vampire"))
                monsterID = i;
        }
    }

    public Forest(Player player) {
        super(player, "Forest", Obstacle.getMonsters().get(monsterID));
    }
}