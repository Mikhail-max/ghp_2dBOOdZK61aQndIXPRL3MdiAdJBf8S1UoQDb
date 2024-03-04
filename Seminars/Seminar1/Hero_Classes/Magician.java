package Seminar1.Hero_Classes;

import java.util.ArrayList;

public class Magician extends Unit {
    public Magician(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}

    public Magician (String name, int x, int y) {
            super(name, x, y,1, 60, 20, 20, 1, 40, 20, 40);
    }

    @Override
    public char Step(ArrayList<Unit> targetTeam) {

        return 0;
    }

    public void curse() {
        System.out.println(this.name + " is cursing the enemy.");
    }


    public void summonDemon() {
        System.out.println(this.name + " is summoning a demon.");
    }


    @Override
    public void Step() {

    }
}
