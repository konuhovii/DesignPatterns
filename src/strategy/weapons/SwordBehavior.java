package strategy.weapons;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Порубил мечом на кебаб!!!");
    }
}
