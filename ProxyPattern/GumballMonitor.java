public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("\n**********REPORT**********\n");
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current Inventory: " + gumballMachine.getCount());
            System.out.println("Current State: " + gumballMachine.getState());
            System.out.println("***********END OF REPORT**********");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
