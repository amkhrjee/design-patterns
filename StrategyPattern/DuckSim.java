public class DuckSim {
    public static void main(String[] args) {
        // MallardDuck mDuck = new MallardDuck();
        // mDuck.display();
        // mDuck.performFly();
        // mDuck.performQuack();

        ModelDuck md = new ModelDuck();
        md.performFly();
        md.performQuack();

        md.setFlyBehaviour(new FlyWithWings());
        md.setQuackBehaviour(new NormalQuack());

        md.performFly();
        md.performQuack();

        md.display();
    }
}

// Here we have separated the changing stuff from the relatively less changing
// stuff