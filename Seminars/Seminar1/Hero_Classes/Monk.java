package Seminar1.Hero_Classes;

import java.util.ArrayList;

public class Monk extends Unit{
    @Override
    public void Step() {

    }

    public Monk(String name, int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Monk (String name, int x, int y) {
            super(name, x, y, 2,35, 30, 2, 5, 3, 20, 50);
    }

    @Override
    public char Step(ArrayList<Unit> targetTeam) {

        return 0;
    }

    public void meditate() {
        System.out.println(this.name + " is meditating.");
    }


    public void rest() {
        System.out.println(this.name + " is using their healing powers.");
    }
}