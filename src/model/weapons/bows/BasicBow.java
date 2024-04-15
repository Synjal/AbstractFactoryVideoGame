package model.weapons.bows;

public class BasicBow extends Bow{
    public BasicBow(int attack) {
        super(attack);
    }

    @Override
    public void hit() {
        System.out.println("You fire an arrow with the Basic Bow !");
        System.out.println("The arrow deals " + attack + " damage.");
    }
}
