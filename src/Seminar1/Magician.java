package Seminar1;

public class Magician extends Unit {
    public Magician(String name, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, health, strength, recovery, protection, intelligence, vitality, damage);
    }

    public Magician() {
        super("Magician", 60, 20, 20, 1, 40, 20, 40);
    }
    public void curse() {
        System.out.println(this.name + " is cursing the enemy.");
    }


    public void summonDemon() {
        System.out.println(this.name + " is summoning a demon.");
    }

}
