public class Test {
    public static void main(String[] args) {
        DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress alice = new Waitress(pancakeHouseMenu, dinerHouseMenu);

        alice.printMenu();
    }
}
