package model.weapons.rods;

public class BasicRod extends Rod {
    public BasicRod(int attack) {
        super(attack);
    }

    @Override
    public void hit() {
        System.out.println("You hit with a Basic Rod !");
        System.out.println("You deal " + attack + " damage");
    }
}
