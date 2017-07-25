package templateMethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();

    final void boilWater() {
        System.out.println("Boiling water");
    }
}
