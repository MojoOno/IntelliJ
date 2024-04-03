public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("A Song of Ice and Fire");
        Book book3 = new Book("Lord of the Rings");
        Bookshelf fantasy = new Bookshelf("Fantasy books");

        fantasy.addBook(book1);
        fantasy.addBook(book2);
        fantasy.addBook(book3);

        fantasy.displayBooks();

        fantasy.removeBook(book1);

        fantasy.displayBooks();

        System.out.println(book1.getTitle());

        KitchenEquipment e1 = new KitchenEquipment("Sautee pande");
        KitchenEquipment e2 = new KitchenEquipment("Kasserolle");
        KitchenEquipment e3 = new KitchenEquipment("Stegepande");
        KitchenEquipment e4 = new KitchenEquipment("Grydeske");
        KitchenEquipment e5 = new KitchenEquipment("Kasserolle");
        KitchenShelf ks = new KitchenShelf("Kitchen equipment");

        ks.addEquipment(e1);
        ks.addEquipment(e2);
        ks.addEquipment(e3);
        ks.addEquipment(e5);

        ks.removeEquipment(e4);
        ks.removeEquipment(e5);

        ks.displayKitchenShelf();
    }
}