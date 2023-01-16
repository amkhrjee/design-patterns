public class AdapterTest {
    public static void main(String[] args) {
        MallardDuck mDuck = new MallardDuck();
        WildTurkey wTurkey = new WildTurkey();

        // Duck methods
        mDuck.quack();
        mDuck.fly();

        // Turkey methods
        wTurkey.gobble();
        wTurkey.shortFly();

        // Adapter Methods
        // A turkey mimicing a duck
        Duck tAdapter = new TurkeyAdapter(wTurkey);
        tAdapter.quack();
        tAdapter.fly();
    }
}
