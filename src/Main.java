import factories.characters.CharacterFactory;
import factories.characters.WarriorFactory;
import factories.weapons.BowFactory;
import factories.weapons.RodFactory;
import factories.weapons.SwordFactory;
import factories.weapons.WeaponFactory;

import static utils.Constants.*;

public class Main {
    public static void main(String[] args) {

        WeaponFactory swords = new SwordFactory();
        WeaponFactory rods = new RodFactory();
        WeaponFactory bows = new BowFactory();

        CharacterFactory warriors = new WarriorFactory();

        warriors.showCharacter(swords.getWeapon(BASIC_SWORD));
        warriors.showCharacter(swords.getWeapon(RUSTY_SWORD));

        warriors.showCharacter(bows.getWeapon(BASIC_BOW));
        warriors.showCharacter(bows.getWeapon(WOODEN_BOW));

        warriors.showCharacter(rods.getWeapon(BASIC_ROD));
        warriors.showCharacter(rods.getWeapon(WOODEN_ROD));

    }
}
