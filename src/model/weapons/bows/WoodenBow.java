package model.weapons.bows;

public class WoodenBow extends Bow{
    public WoodenBow(int attack) {
        super(attack);
    }

    @Override
    public void hit() {
        System.out.println("You fire an arrow with the Wooden Bow !");
        System.out.println("The arrow deals " + attack + " damage.");
    }
}
