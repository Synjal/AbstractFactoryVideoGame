package factories.weapons;

import model.weapons.rods.BasicRod;
import model.weapons.Weapon;
import model.weapons.rods.WoodenRod;

public class RodFactory extends WeaponFactory{
    @Override
    protected Weapon createWeapon(String type) {
        return switch (type) {
            case "BasicRod" -> new BasicRod(5);
            case "WoodenRod" -> new WoodenRod(8);
            default -> null;
        };
    }
}
