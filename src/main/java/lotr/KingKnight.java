package lotr;
import java.util.Random;

public class KingKnight {
    public static int generateRandom(int first, int second) {
        Random random = new Random();
        return random.nextInt(second-first) + first;
    }

    static void kick(Character l, Character c) {
        Random random = new Random();
        int rand = random.nextInt(l.getHp() + 1);
        c.setHp(c.getHp() - rand);
    }
}
