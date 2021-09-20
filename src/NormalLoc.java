abstract class NormalLoc extends Location {
    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    boolean onLocation() {
        System.out.println("Welcome to the Tool Store");
        return true;
    }
}
