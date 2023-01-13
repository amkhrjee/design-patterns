public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new NormalQuack();
    }

    public void display() {
        System.out.println("I am a Malllard Duck");
    }
}
