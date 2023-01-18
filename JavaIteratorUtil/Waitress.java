import java.util.Iterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerHouseMenu dinerHouseMenu;
    CafeMenu cafeMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerHouseMenu dinerHouseMenu, CafeMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerHouseMenu = dinerHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerHouseMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();
        System.out.println("==========All Menus Merged=========");
        printMenu(pancakeMenuIterator);
        printMenu(dinerMenuIterator);
        printMenu(cafeMenuIterator);
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "        " + menuItem.getPrice());
        }
    }
}
