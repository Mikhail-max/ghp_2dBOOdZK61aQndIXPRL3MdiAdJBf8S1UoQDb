package Seminar1;

public class Spearman extends Unit {
    public Spearman(String name, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, health, strength, recovery, protection, intelligence, vitality, damage);
    }

    public Spearman() {
        super("Spearman", 120, 20, 20, 10, 3, 20, 25);
    }
    public void brace() {
        System.out.println(this.name + " is bracing with their spear.");
    }


    public void thrust() {
        System.out.println(this.name + " is thrusting their spear.");
    }
}
