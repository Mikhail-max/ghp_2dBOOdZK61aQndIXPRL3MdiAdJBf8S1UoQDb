package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Spearman extends Warriors implements Step {
    public Spearman(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}

    public Spearman(String name, int x, int y) {
            super(name, x, y,2, 120, 20, 20, 10, 3, 20, 25);
    }




    public void brace() {
        System.out.println(this.name + " is bracing with their spear.");
    }


    public void thrust() {
        System.out.println(this.name + " is thrusting their spear.");
    }


}
