package Seminar1;

public class Crossbowman extends Unit{
    public Crossbowman(String name, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, health, strength, recovery, protection, intelligence, vitality, damage);
    }
    public Crossbowman(){
        super("Crossbowman", 80, 20, 20, 1, 3, 20, 40);
    }
    public void reload() {
        System.out.println(this.name + " is reloading their crossbow.");
    }


    public void fire() {
        System.out.println(this.name + " is firing their crossbow.");
    }
}
