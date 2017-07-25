package templateMethod;

public class Coffee extends CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
