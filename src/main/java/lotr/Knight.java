package lotr;

public class Knight extends Character{
    public Knight() {
        super(KingKnight.generateRandom(2, 12), KingKnight.generateRandom(2, 12));
    }

    @Override
    public void kick(Character c) {
        KingKnight.kick(this, c);
    }
}
