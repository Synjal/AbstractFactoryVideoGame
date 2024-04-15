package model.weapons.bows;

import model.weapons.Weapon;

public abstract class Bow implements Weapon {

    int attack;

    protected Bow(int attack) {
        this.attack = attack;
    }

    @Override
    public void hit() {
        System.out.println("You fire an arrow !");
        System.out.println("The arrow deals " + attack + " damage.");
    }
}
