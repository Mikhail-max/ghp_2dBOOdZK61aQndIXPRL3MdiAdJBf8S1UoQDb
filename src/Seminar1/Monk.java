package Seminar1;

public class Monk extends Unit{
    public Monk(String name, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, health, strength, recovery, protection, intelligence, vitality, damage);
    }
    public Monk() {
        super("Monk", 140, 30, 2, 5, 3, 20, 50);
    }
    public void meditate() {
        System.out.println(this.name + " is meditating.");
    }


    public void rest() {
        System.out.println(this.name + " is using their healing powers.");
    }
}