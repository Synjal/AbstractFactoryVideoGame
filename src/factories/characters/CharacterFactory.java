package factories.characters;

import model.characters.Character;
import model.weapons.Weapon;

public abstract class CharacterFactory {

    public void showCharacter(Weapon weapon) {
        Character c = createCharacter();
        System.out.println();
        c.sayHi();
        c.useWeapon(weapon);
        System.out.println("--------------------------------");
    }

    protected abstract Character createCharacter();
}
