public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepare();
        System.out.println("--------------------------------");
        tea.prepare();
    }
}
