package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("The battle begins!");

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println("First character attacks the second.");
            System.out.println("The second character has " + c2.getHp() + " health remaining.");

            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println("Second character attacks the first.");
                System.out.println("The first character has " + c1.getHp() + " health remaining.");
            }
        }

        if (c1.isAlive()) {
            System.out.println("The first character wins the fight.");
        } else {
            System.out.println("The second character wins the fight.");
        }
    }
}
