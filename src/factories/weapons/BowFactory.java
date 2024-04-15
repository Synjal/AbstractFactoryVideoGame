package factories.weapons;

import model.weapons.Weapon;
import model.weapons.bows.BasicBow;
import model.weapons.bows.WoodenBow;

public class BowFactory extends WeaponFactory{

    @Override
    protected Weapon createWeapon(String type) {
        return switch (type) {
            case "BasicBow" -> new BasicBow(5);
            case "WoodenBow" -> new WoodenBow(8);
            default -> null;
        };
    }

}
