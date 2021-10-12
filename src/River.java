public class River extends BattleLoc {
    private static int monsterID = 0;
    static {
        for (int i = 0; i < Obstacle.getMonsters().size(); i++) {
            if (Obstacle.getMonsters().get(i).getName().toLowerCase().equals("bear"))
                monsterID = i;
        }
    }

    public River(Player player) {
        super(player, "River", Obstacle.getMonsters().get(monsterID), "Ancient Scroll");
    }
}
