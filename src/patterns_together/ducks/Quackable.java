package patterns_together.ducks;

import patterns_together.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
