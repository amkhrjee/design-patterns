import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("Waffle", 12, true);
        addItem("Pancake", 20, true);
        addItem("Chicken Patty", 40, false);

    }

    public void addItem(String name, double price, boolean veg) {
        MenuItem menuItem = new MenuItem(name, price, veg);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}