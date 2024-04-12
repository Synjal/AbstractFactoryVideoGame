package model.weapons;

public class Sword implements Weapon{

    @Override
    public void hit() {
        System.out.println("You hit with a sword !");
    }
}
