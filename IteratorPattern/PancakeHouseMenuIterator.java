import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> pancakeHouseMenu) {
        this.menuItems = pancakeHouseMenu;
    }

    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        }
        return true;
    }

    public MenuItem next() {
        return menuItems.get(position++);
    }
}
