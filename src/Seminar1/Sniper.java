package Seminar1;

public class Sniper  extends Unit{
    public Sniper (String name, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, health, strength, recovery, protection, intelligence, vitality, damage);
    }
    public Sniper () {
        super("Sniper", 50, 20, 20, 15, 15, 20, 40);
    }
    public void aim() {
        System.out.println(this.name + " is aiming the sniper rifle.");
    }


    public void shoot() {
        System.out.println(this.name + " is shooting the sniper rifle.");
    }
}