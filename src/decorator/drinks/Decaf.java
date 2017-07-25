package decorator.drinks;

import decorator.base.Beverage;

/**
 * Created by Администратор on 07.03.2017.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
