package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Sniper  extends Unit implements Step {
    protected int arrows;

    public int getArrows() {
        return arrows;
    }

    public Sniper(String name, int x, int y, int initiative,int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Sniper (String name, int x, int y) {
            super(name, x, y, 3,50, 20, 20, 15, 15, 20, 40);
        this.arrows = 5;
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




    @Override
    public void Step(ArrayList<Unit> targetTeam) {
        if (Dead(Sniper.this)==true){
            if(Sniper.this.getArrows() > 0 ){
                Sniper.this.Attack(this.nearTarget(targetTeam));
                this.arrows -= 1;
                Sniper.this.setArrows(this.arrows);
                System.out.printf("Cтрел осталось %d\n", getArrows());
            }else{
                System.out.println("Нет стрел\n");
            }
        }


    }

}