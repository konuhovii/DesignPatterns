package patterns_together.ducks;

import patterns_together.observer.Observable;
import patterns_together.observer.Observer;

public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

}
