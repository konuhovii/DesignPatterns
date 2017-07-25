package strategy.weapons;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Хуяк из лука в глаз!!!");
    }
}
