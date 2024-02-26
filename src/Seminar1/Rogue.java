package Seminar1;

public class Rogue extends Unit{
    public Rogue (String name, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, health, strength, recovery, protection, intelligence, vitality, damage);
    }
    public Rogue () {
        super("Rogue", 60, 20, 20, 10, 3, 20, 40);
    }
    public void pickPocket() {
        System.out.println(this.name + " is picking pockets.");
    }


    public void sneak() {
        System.out.println(this.name + " is sneaking around.");
    }
}