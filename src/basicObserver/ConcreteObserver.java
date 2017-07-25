package basicObserver;

public class ConcreteObserver implements Observer {
    @Override
    public void update(int number) {
        System.out.println(number);
    }
}
