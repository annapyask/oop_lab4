package lotr;
import java.lang.reflect.InvocationTargetException;

public class CharacterFactory {
    private static Class<?>[] AllClasses = {Hobbit.class, Elf.class, Knight.class, King.class};
    Character createCharacter() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        int rand = KingKnight.generateRandom(0, 4);
        return (Character) AllClasses[rand].getDeclaredConstructor().newInstance();
    }
}
