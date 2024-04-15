package factories.characters;

import model.characters.Character;
import model.characters.Warrior;

public class WarriorFactory extends CharacterFactory{

    @Override
    protected Character createCharacter() {
        return new Warrior();
    }
}
