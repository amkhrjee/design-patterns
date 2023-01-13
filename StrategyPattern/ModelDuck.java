public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyWithRocket();
        quackBehaviour = new RoboticQuack();
    }

    public void display() {
        System.out.println("I look like a robot");
    }
}
