public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\nYou are in safe house !");
        super.getPlayer().setHealth(super.getPlayer().getCharType().getHealth());
        System.out.println("Your health is recovered\n");
        return true;
    }
}
