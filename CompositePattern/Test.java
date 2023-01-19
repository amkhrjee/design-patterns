public class Test {
    public static void main(String[] args) {
        MenuComponent pancakeHoueMenu = new Menu("PANCAKE HOUSE MENU");
        MenuComponent dinerHoueMenu = new Menu("DINER HOUSE MENU");
        MenuComponent cafeMenu = new Menu("CAFE MENU");
        MenuComponent dessertMenu = new Menu("DESSERT MENU");

        MenuComponent allMenus = new Menu("All Menus");

        allMenus.add(pancakeHoueMenu);
        allMenus.add(dinerHoueMenu);
        allMenus.add(cafeMenu);

        pancakeHoueMenu.add(new MenuItem("Waffle", 50, true));
        dinerHoueMenu.add(new MenuItem("Chicken Soup", 450, false));
        cafeMenu.add(new MenuItem("Chai", 10, true));
        dessertMenu.add(new MenuItem("Pastry", 100, false));
        dinerHoueMenu.add(dessertMenu);

        Waitress alice = new Waitress(allMenus);
        // alice.printMenu();
        alice.printVegetarianMenu();
    }
}
