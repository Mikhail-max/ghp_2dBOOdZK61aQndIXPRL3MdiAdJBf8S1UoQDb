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
        this.arrows = 5;
    }

    @Override
    public char Step(ArrayList<Unit> targetTeam) {
        if (Dead(Crossbowman.this) == true) {
            System.out.printf("\n%s готов к действиям\n", getName());
            if (Crossbowman.this.getArrows() > 0) {
                System.out.printf("%s готов к стрельбе, стрел еще %d\n", getName(), getArrows());
                System.out.printf("%s атакует %s\n", getName(), this.nearTarget(Crossbowman.this, targetTeam).getName());
                Crossbowman.this.Attack(this.nearTarget(Crossbowman.this, targetTeam));
                System.out.println(this.nearTarget(Crossbowman.this, targetTeam).getInfo());
                this.arrows -= 1;
                Crossbowman.this.setArrows(this.arrows);
                System.out.printf("Cтрел осталось %d\n", getArrows());
            } else {
                System.out.println("Нет стрел\n");
            }
        }
        return 0;
    }






    public void reload() {
        System.out.println(this.name + " is reloading their crossbow.");
    }


    public void fire() {
        System.out.println(this.name + " is firing their crossbow.");
    }

    @Override
    public void Step() {


    }


    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }}

