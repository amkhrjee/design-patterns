public class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Sorry, no gumballs left!");
    }

    public void ejectQuarter() {
        System.out.println("Ok! here goes your quarter!");
    }

    public void turnCrank() {
        System.out.println("No gumballs bruv");
    }

    public void dispense() {
        System.out.println("No gumballs left!!!");
    }
}
