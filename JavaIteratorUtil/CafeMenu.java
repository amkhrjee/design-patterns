import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu {
    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public CafeMenu() {
        addItem("Mocha", 100, true);
        addItem("Cappacino", 100, true);
        addItem("Chai", 100, true);
    }

    public void addItem(String name, double price, boolean veg) {
        MenuItem menuItem = new MenuItem(name, price, veg);
        menuItems.put(name, menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}