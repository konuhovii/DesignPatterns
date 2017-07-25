package strategy.characters;

import strategy.weapons.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior w;
    protected String name;

    public void fight() {
        System.out.print(name + ": ");
        w.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.w = w;
    }

    public String getName() {
        return name;
    }
}
