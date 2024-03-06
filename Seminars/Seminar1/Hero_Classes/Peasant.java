package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Peasant extends Warriors implements Step {

    public Peasant(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Peasant(String name, int x, int y) {
            super(name, x, y, 0, 100, 10, 10, 3, 3, 20, 20);
    }



    public void plow() {
        System.out.println(this.name + " is plowing the field.");
    }
    public void harvest() {
        System.out.println(this.name + " is harvesting the crops.");
    }

    @Override
    public void Step(ArrayList<Unit> targetTeam) {
        super.Step(targetTeam);
    }
}
