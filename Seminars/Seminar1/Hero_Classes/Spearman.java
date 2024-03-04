package Seminar1.Hero_Classes;

import java.util.ArrayList;

public class Spearman extends Unit {
    public Spearman(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}

    public Spearman(String name, int x, int y) {
            super(name, x, y,2, 120, 20, 20, 10, 3, 20, 25);
    }

    @Override
    public char Step(ArrayList<Unit> targetTeam) {

        return 0;
    }

    public void brace() {
        System.out.println(this.name + " is bracing with their spear.");
    }


    public void thrust() {
        System.out.println(this.name + " is thrusting their spear.");
    }

    @Override
    public void Step() {

    }
}
