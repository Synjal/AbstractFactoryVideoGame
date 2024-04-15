package model.weapons.rods;

import model.weapons.Weapon;

public abstract class Rod implements Weapon {

    int attack;

    protected Rod(int attack) {
        this.attack = attack;
    }

    @Override
    public void hit() {
        System.out.println("You use the Rod !");
        System.out.println("You deal " + attack + " damage");
    }
}
