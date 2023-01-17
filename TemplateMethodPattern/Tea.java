public class Tea extends CaffeineBevarage {
    public void brew() {
        System.out.println("Dipping tea bag...");
    }

    public void addCondiments() {
        System.out.println("Adding lemon...");
    }

    @Override
    public void hook() {
        // super.hook();
        System.out.println("Hello from Hook!!!");
    }
}
