public class Test {
    public static void main(String[] args) {
        DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress alice = new Waitress(pancakeHouseMenu, dinerHouseMenu, cafeMenu);

        alice.printMenu();
    }
}
