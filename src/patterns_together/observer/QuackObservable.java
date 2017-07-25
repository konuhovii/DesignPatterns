package patterns_together.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
