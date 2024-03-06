package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Rogue extends Warriors implements Step {
    public Rogue(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Rogue (String name, int x, int y) {
        super(name, x, y, 2, 60, 20, 20, 10, 3, 20, 40);
    }




    public void pickPocket() {
        System.out.println(this.name + " is picking pockets.");
    }


    public void sneak() {
        System.out.println(this.name + " is sneaking around.");
    }

    @Override
    public void Step(ArrayList<Unit> targetTeam) {
        super.Step(targetTeam);
    }
}