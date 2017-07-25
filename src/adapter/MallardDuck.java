package adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Лечу, прикинь!");
    }
}
