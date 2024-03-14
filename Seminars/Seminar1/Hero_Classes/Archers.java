package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Archers extends  Unit implements Step {
    protected int arrows;

    public Archers(String name, int x, int y, int initiative,int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public void Step(ArrayList<Unit> targetTeam) {

        if (Dead(nearTarget(targetTeam))){
            if(Archers.this.getArrows() > 0 ){
                Archers.this.Attack(nearTarget(targetTeam));
                this.arrows -= 1;
                Archers.this.setArrows(this.arrows);
                /*  System.out.printf("Cтрел осталось %d\n", getArrows());*/
            }else{
                /* System.out.println("Нет стрел\n");*/
            }

        }


    }
}
