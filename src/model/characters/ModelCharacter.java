package model.characters;

import model.weapons.Weapon;

import java.util.logging.Logger;

public abstract class ModelCharacter implements Character{
    Logger logger = Logger.getLogger(getClass().getName());

    public void sayHi(){
        logger.info("Hi, I'm a character !");
    }

    public void useWeapon(Weapon weapon) {
        weapon.hit();
    }
}
