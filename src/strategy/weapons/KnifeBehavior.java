package strategy.weapons;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Чик чик ножом!!!");
    }
}
