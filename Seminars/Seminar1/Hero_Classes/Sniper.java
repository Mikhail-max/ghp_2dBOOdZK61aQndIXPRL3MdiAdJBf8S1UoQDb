package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Sniper  extends Archers implements Step {
    protected int arrows;

    public int getArrows() {
        return arrows;
    }

    public Sniper(String name, int x, int y, int initiative,int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Sniper (String name, int x, int y) {
            super(name, x, y, 3,50, 20, 20, 15, 15, 20, 40);
        this.arrows = 500;
    }
    public void aim() {
        System.out.println(this.name + " is aiming the sniper rifle.");
    }


    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public void shoot() {
        System.out.println(this.name + " is shooting the sniper rifle.");
    }






}