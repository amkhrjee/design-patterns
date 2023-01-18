public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerHouseMenu dinerHouseMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerHouseMenu dinerHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerHouseMenu = dinerHouseMenu;
    }

    public void printMenu() {
        Iterator pancakeMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerHouseMenu.createIterator();
        System.out.println("==========All Menus Merged=========");
        printMenu(pancakeMenuIterator);
        printMenu(dinerMenuIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "        " + menuItem.getPrice());
        }
    }
}
