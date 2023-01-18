public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] dinerHouseMenu) {
        this.menuItems = dinerHouseMenu;
    }

    public MenuItem next() {
        return menuItems[position++];
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
