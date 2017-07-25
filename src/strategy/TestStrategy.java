package strategy;

import strategy.characters.Character;
import strategy.characters.*;
import strategy.weapons.AxeBehavior;
import strategy.weapons.BowAndArrowBehavior;
import strategy.weapons.KnifeBehavior;
import strategy.weapons.SwordBehavior;

import java.util.ArrayList;
import java.util.List;

public class TestStrategy {
    public static void main(String[] args) {
        List<strategy.characters.Character> characters = new ArrayList<>();

        Character character = new King();
        character.setWeapon(new BowAndArrowBehavior());
        characters.add(character);

        character = new Queen();
        character.setWeapon(new KnifeBehavior());
        characters.add(character);

        character = new Throll();
        character.setWeapon(new AxeBehavior());
        characters.add(character);

        character = new Knight();
        character.setWeapon(new SwordBehavior());
        characters.add(character);

        for (Character c :
                characters) {
            c.fight();
        }
    }
}
