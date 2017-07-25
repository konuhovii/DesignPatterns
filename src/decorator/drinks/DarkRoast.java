package decorator.drinks;

import decorator.base.Beverage;

/**
 * Created by Администратор on 07.03.2017.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
