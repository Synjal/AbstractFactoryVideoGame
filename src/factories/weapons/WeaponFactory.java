package factories.weapons;

import model.weapons.Weapon;

public abstract class WeaponFactory {

    public Weapon getWeapon(String type) {
        return createWeapon(type);
    }

    protected abstract Weapon createWeapon(String type);
}
