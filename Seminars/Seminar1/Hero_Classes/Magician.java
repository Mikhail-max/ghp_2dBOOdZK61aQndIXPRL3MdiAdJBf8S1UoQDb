package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Magician extends Unit{

    int magarrows;

    public int getMagarrows() {
        return magarrows;
    }

    public void setMagarrows(int magarrows) {
        this.magarrows = magarrows;
    }

    public Magician(String name, int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}

    public Magician (String name, int x, int y) {
            super(name, x, y,1, 60, 20, 20, 1, 40, 20, 40);
    }



    public void curse() {
        System.out.println(this.name + " is cursing the enemy.");
    }


    public void summonDemon() {
        System.out.println(this.name + " is summoning a demon.");
    }

    public void Step(ArrayList<Unit> targetTeam) {
        if (Dead(Magician.this)){
            if (Dead(nearTarget(targetTeam))){
                if(Magician.this.getMagarrows() > 0 ){
                    Magician.this.Attack(nearTarget(targetTeam));
                    this.magarrows -= 1;
                    Magician.this.setMagarrows(this.magarrows);
                    System.out.printf("Cтрел осталось %d\n", getMagarrows());
                }else{
                    System.out.println("Нет стрел\n");
                }
            }else {targetTeam.remove(nearTarget(targetTeam));}
        }


    }

}
