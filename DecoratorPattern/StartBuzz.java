import java.security.GeneralSecurityException;

public class StartBuzz {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
