package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Crossbowman extends Archers implements Step {
    protected int arrows;
    public Crossbowman(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);
    }


    public Crossbowman(String name, int x, int y){
            super(name, x, y, 3,80, 20, 20, 1, 3, 20, 40);
        this.arrows = 500;
    }







    public void reload() {
        System.out.println(this.name + " is reloading their crossbow.");
    }


    public void fire() {
        System.out.println(this.name + " is firing their crossbow.");
    }




    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }}

