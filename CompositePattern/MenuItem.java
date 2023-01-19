import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    double price;
    boolean vegetarian;

    public MenuItem(String name, double price, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print("Name: " + name);
        if (vegetarian) {
            System.out.print(" (Veg)");
        } else {
            System.out.println(" (Non-veg)");
        }
        System.out.print("  Price: " + price + "\n");
    }

    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
