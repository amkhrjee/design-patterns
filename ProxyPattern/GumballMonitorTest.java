import java.rmi.Naming;

// Make sure to keep the GumballMachines up and running before running this
public class GumballMonitorTest {
    public static void main(String[] args) {
        GumballMonitor monitor = null;
        try {
            GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup("TheGumballMachine");
            monitor = new GumballMonitor(gumballMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
