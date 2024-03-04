package Seminar1.Hero_Classes;

import Seminar1.Coordinate.Coordinate;
import Seminar1.Interface.Step;

import java.util.List;

public abstract class Unit implements Step {
    protected int health, maxhealth, strength, recovery, vitality, intelligence, damage, protection;
    protected String name;
    protected Coordinate coordinate;
    int x;
    int y;
    int initiative;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public int getHealth() {
        return health;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public int getStrength() {
        return strength;
    }

    public int getRecovery() {
        return recovery;
    }

    public int getVitality() {
        return vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDamage() {
        return damage;
    }

    public int getProtection() {
        return protection;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Unit(String name, int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage){
        this.name = name;
        this.strength = strength;
        this.initiative = initiative;
        this.recovery = recovery;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.health = health;
        this.maxhealth = health;
        this.damage = damage;
        this.protection = protection;
        this.x = x;
        this.y = y;
        coordinate = new Coordinate(x,y);
    }
    public Unit(String name, int x, int y){

    }



    public String getName()      { return name; }


    public int getInitiative() {
        return initiative;
    }

    public Unit nearTarget(Unit hero, List<Unit> zlo) {
        int distmin = 1000;
        int dist = 0;
        int minind = 0;
        Unit minindexhero = zlo.get(0);

        Coordinate distance = new Coordinate();
        for (int i = 0; i < zlo.size(); i++) {
            dist = distance.distance(hero.getX(), hero.getY(), zlo.get(i).getX(), zlo.get(i).getY());

            if (distmin > dist){
                distmin = dist;
                minind = i;
                minindexhero = zlo.get(minind);

            }

        }
        return minindexhero;
    }
    /*public String nearTarget(ArrayList<Unit> targetTeam){
        double minDistance = Double.MAX_VALUE;
        int id = -1;

        for (Unit unit : targetTeam){
            if(getCoordinate().distance(Unit.this.getCoordinate().getXposition(),
                    Unit.this.getCoordinate().getYposition(),
                    unit.getCoordinate().getXposition(),
                    unit.getCoordinate().getYposition()) < minDistance){
                minDistance = getCoordinate().distance(Unit.this.getCoordinate().getXposition(),
                        Unit.this.getCoordinate().getYposition(),
                        unit.getCoordinate().getXposition(),
                        unit.getCoordinate().getYposition());
                id = unit.getId();
            }
            return id;
        }
    }*/




    public String getInfo() {
        return "Name: " + this.name + " Type: " + this.getClass().getSimpleName() + " Health: " + this.health + " из " + this.maxhealth;

    }
    public String getInfoCoord(){
//        int x = 0;
//        int y = 0;
        String format;
        format = String.format("Name: %s x: %d y: %d", this.name, x, y);
        return format;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + " Type: " + this.getClass().getSimpleName() + " Health: " + this.health + " из " + this.maxhealth + " x " + getX() + " y " + getY() + " inititacive " + getInitiative() +  " strength: " + this.strength + " recovery: "
                + this.recovery + " vitality: " + this.vitality + " intelligence: " + this.intelligence
                + " damage: " + this.damage + " protection: " + this.protection;

    }

    public void GetDamage(int damage) {
        if (damage > protection) {
            damage = damage - protection;
            if (this.health - damage > 0) {
                this.health -= damage;
            } else {
                this.health = 0;
                System.out.println("Персонаж " + this.name + " умер");
            }
        }
    }
    public void Attack(Unit target){
            target.GetDamage(this.damage);
        }


    public void GetHeal(int damage){
        if (this.health < this.maxhealth){
            this.health = this.health + damage / 2;
            if (this.health > this.maxhealth){
                this.health = this.maxhealth;
            }
        }
    }
    public void Heal(Unit name){
        name.GetHeal(this.damage);
    }
    public boolean Dead(Unit target){
        if (this.getHealth() <= 0){
            System.out.printf("%s dead.", target.getName());
            return false;
        }else {
            System.out.printf("%s if life left %d, protection left %d",
                    target.getName(), target.getHealth(),target.getProtection());
        }
        return true;
    }


}