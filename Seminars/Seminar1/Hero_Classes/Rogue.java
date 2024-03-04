package Seminar1.Hero_Classes;

import java.util.ArrayList;

public class Rogue extends Unit{
    public Rogue(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Rogue (String name, int x, int y) {
        super(name, x, y, 2, 60, 20, 20, 10, 3, 20, 40);
    }

    @Override
    public char Step(ArrayList<Unit> targetTeam) {

        return 0;
    }

    public void pickPocket() {
        System.out.println(this.name + " is picking pockets.");
    }


    public void sneak() {
        System.out.println(this.name + " is sneaking around.");
    }

    @Override
    public void Step() {

    }
}