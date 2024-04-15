package model.weapons.swords;

public class BasicSword extends Sword{
    public BasicSword(int attack) {
        super(attack);
    }

    @Override
    public void hit() {
        System.out.println("You hit with a Basic Sword !");
        System.out.println("You deal " + attack + " damage");
    }
}
