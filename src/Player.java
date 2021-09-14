public class Player {
    Inventory inventory;
    int damage, health, money;
    String name;

    protected void selectChar() {
        System.out.println("WELCOME! BRAVE WARRIOR.. \n Did you decided your own destiny as a character?!");
        System.out.println("Just so you know the journey ahaed of you is not meant for the shilly-shally");
        System.out.println("Now your first action to choose is how you define yourself in battle arena.");
        StoreItem.printInvoiceHeader();
        StoreItem.buildInvoice().forEach(StoreItem::printInvoice);
    }
}
