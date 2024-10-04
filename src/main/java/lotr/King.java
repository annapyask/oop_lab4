package lotr;

public class King extends Character {
    public King() {
        super(KingKnight.generateRandom(5, 15), KingKnight.generateRandom(5, 15));
    }

    @Override
    public void kick(Character c) {
        KingKnight.kick(this, c);
    }
}
