public class DinerHouseMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerHouseMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Chhole Bhatoore", 40, true);
        addItem("Aloo Parantha", 70, true);
        addItem("Roti Chicken", 60, false);
    }

    public void addItem(String name, double price, boolean veg) {
        MenuItem menuItem = new MenuItem(name, price, veg);
        try {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Max number of items reached!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
