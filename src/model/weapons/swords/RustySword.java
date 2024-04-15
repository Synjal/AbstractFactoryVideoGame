package model.weapons.swords;

public class RustySword extends Sword{

    public RustySword(int attack) {
        super(attack);
    }

    @Override
    public void hit() {
        System.out.println("You hit with a Rusty Sword !");
        System.out.println("You deal " + attack + " damage");
    }
}
