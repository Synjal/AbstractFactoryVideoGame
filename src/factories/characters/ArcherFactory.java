package factories.characters;

import model.characters.Archer;
import model.characters.Character;

public class ArcherFactory extends CharacterFactory{
    @Override
    protected Character createCharacter() {
        return new Archer();
    }
}
