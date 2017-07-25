package factory.regional;

import factory.ingredients.ChicagoPizzaIngredientFactory;
import factory.ingredients.NYPizzaIngredientFactory;
import factory.ingredients.PizzaIngredientFactory;
import factory.pizza.*;
import factory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } /*else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }*/ else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } /*else if (type.equals("pepperoni")) {
            pizza = new PepperonyPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }*/
        return pizza;
    }
}
