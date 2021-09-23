public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in safe house !");
        super.getPlayer().setHealth(super.getPlayer().getCharType().getHealth());
        System.out.println("Your health is recovered");
        return true;
    }
}
