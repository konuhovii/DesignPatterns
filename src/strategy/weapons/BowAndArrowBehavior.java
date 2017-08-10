package strategy.weapons;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Чик из лука в глаз!!!");
    }
}
