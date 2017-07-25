package state;

public class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        isSoldOut();
    }

    private void isSoldOut() {
        System.out.println("Machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        isSoldOut();
    }

    @Override
    public void turnCrank() {
        isSoldOut();
    }

    @Override
    public void dispense() {
        isSoldOut();
    }
}
