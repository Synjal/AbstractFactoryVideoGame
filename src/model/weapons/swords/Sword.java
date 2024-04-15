package model.weapons.swords;

import model.weapons.Weapon;

public abstract class Sword implements Weapon {

    int attack;

    protected Sword(int attack) {
        this.attack = attack;
    }

    @Override
    public void hit() {
        System.out.println("You hit with a sword !");
        System.out.println("You deal " + attack + " damage");
    }
}
