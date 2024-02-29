package Seminar1.Hero_Classes;

public class Peasant extends Unit{

    public Peasant(String name,int x, int y, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Peasant(String name, int x, int y) {
            super(name, x, y, 100, 10, 10, 3, 3, 20, 20);
    }

    public void plow() {
        System.out.println(this.name + " is plowing the field.");
    }
    public void harvest() {
        System.out.println(this.name + " is harvesting the crops.");
    }
}
