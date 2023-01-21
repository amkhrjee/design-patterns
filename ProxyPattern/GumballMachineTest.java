import java.rmi.Naming;

// Run rmiregistry in background before running this
public class GumballMachineTest {
    public static void main(String[] args) {
        // GumballMachine gumballMachine = new GumballMachine(args[0],
        // Integer.parseInt(args[1]));
        GumballMachine gumballMachine = null;
        try {

            gumballMachine = new GumballMachine("Ohio", 6);
            Naming.rebind("TheGumballMachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // GumballMonitor monitor = new GumballMonitor(gumballMachine);

        // monitor.report();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);

    }
}
