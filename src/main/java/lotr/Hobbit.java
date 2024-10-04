package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3);
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
        return "Hobbit{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
