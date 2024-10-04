package lotr;
import lombok.Getter;

@Getter
public class Character {
    private int power;
    private int hp;
    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }
    
    void kick(Character c) {
        if (power > c.getPower()) {
            c.setHp(0);
        } else {
            c.setPower(c.getPower()- 1);
        }
    }
    boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void setPower(int power) {
        this.power = power;
    }

    
}
