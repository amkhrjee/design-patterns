public abstract class CaffeineBevarage {
    final public void prepare() {
        boilWater();
        pourInCup();
        brew();
        addCondiments();
        hook();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup...");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void hook() {
        System.out.println("This is hook from Super class");
    }
}