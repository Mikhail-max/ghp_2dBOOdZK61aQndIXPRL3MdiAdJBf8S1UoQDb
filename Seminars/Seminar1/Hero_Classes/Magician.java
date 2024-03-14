package Seminar1.Hero_Classes;

import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Magician extends Unit{

    int mana;

    public Magician() {

    }


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Magician(String name, int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}

    public Magician (String name, int x, int y) {
            super(name, x, y,1, 60, 20, 20, 1, 40, 20, 40);
            this.mana = 10;
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
                if(Magician.this.getMana() == 10 ){
                    ArrayList<Unit> deathHero = new ArrayList<>();
                    for (Unit element : FindTeam(Magician.this)) {
                        if(element.getHealth() <= 0){
                            deathHero.add(element);}}
                    if (deathHero.size() >= 3) {
                        FindUnitDeath(FindTeam(Magician.this)).setHealth(getMaxhealth());
                        mana = 0;
                    }
                    }
                if (Magician.this.getMana() > 1){
                    int minhp = 10000;
                    Unit heroo = new Magician();
                    for (Unit element:FindTeam(Magician.this)){
                        if (element.getMaxhealth() > element.getHealth()){
                            if (element.getHealth() > 0) {
                                if (minhp > element.getHealth()) {
                                    minhp = element.getHealth();
                                    heroo = element;
                                }
                            }
                        }
                    }
                    heroo.setHealth(heroo.getHealth() + 10);
                }else {
                    this.setMana(this.getMana() + 1);
                }

                }

            }
        }


    public Unit FindUnitDeath(ArrayList<Unit> team) {
        Unit herohMinHP = null;
        for (Unit element : team) {
            if(element.getHealth() <= 0){
                herohMinHP = element;
                break;
            }
        }
        return herohMinHP;

    }
}

