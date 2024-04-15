package factories.weapons;

import model.weapons.swords.BasicSword;
import model.weapons.swords.RustySword;
import model.weapons.Weapon;

public class SwordFactory extends WeaponFactory{

    @Override
    protected Weapon createWeapon(String type) {
        return switch (type) {
            case "BasicSword" -> new BasicSword(5);
            case "RustySword" -> new RustySword(8);
            default -> null;
        };
    }
}
