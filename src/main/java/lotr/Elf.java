package lotr;
public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }
    void kick(Character c) {
        if (this.getPower() > c.getPower()) {
            c.setHp(0);
        } else {
            c.setPower(c.getPower()- 1);
        }
    }

    @Override
    public String toString() {
        return "Elf{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
