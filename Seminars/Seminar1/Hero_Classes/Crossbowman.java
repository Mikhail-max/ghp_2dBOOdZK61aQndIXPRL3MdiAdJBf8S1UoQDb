package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Crossbowman extends Unit implements Step {
    protected int arrows;
    public Crossbowman(String name,int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);
    }


    public Crossbowman(String name, int x, int y){
            super(name, x, y, 3,80, 20, 20, 1, 3, 20, 40);
        this.arrows = 500;
    }

    @Override
    public void Step(ArrayList<Unit> targetTeam) {
        if (Dead(Crossbowman.this)){
            if (Dead(nearTarget(targetTeam))){
                if(Crossbowman.this.getArrows() > 0 ){
                    Crossbowman.this.Attack(nearTarget(targetTeam));
                    this.arrows -= 1;
                    Crossbowman.this.setArrows(this.arrows);
                    /*System.out.printf("Cтрел осталось %d\n", getArrows());*/
                }else{
                    /*System.out.println("Нет стрел\n");*/
                }
            }else {targetTeam.remove(nearTarget(targetTeam));}
        }


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

