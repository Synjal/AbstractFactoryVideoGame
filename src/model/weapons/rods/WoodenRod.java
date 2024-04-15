package model.weapons.rods;

public class WoodenRod extends Rod {
    public WoodenRod(int attack) {
        super(attack);
    }

    @Override
    public void hit() {
        System.out.println("You hit with a Wooden Rod !");
        System.out.println("You deal " + attack + " damage");
    }
}
