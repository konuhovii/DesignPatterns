package decorator.condiments;

import decorator.base.Beverage;
import decorator.base.CondimentDecorator;

/**
 * Created by Администратор on 07.03.2017.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
