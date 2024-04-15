package factories.characters;

import model.characters.Character;
import model.characters.Mage;

public class MageFactory extends CharacterFactory{
    @Override
    protected Character createCharacter() {
        return new Mage();
    }
}
