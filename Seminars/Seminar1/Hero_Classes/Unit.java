package Seminar1.Hero_Classes;

import Seminar1.Coordinate.Coordinate;

import java.util.List;

public abstract class Unit {
    protected int health, maxhealth, strength, recovery, vitality, intelligence, damage, protection;
    protected String name;
    protected Coordinate coordinate;
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    public Unit(String name, int x, int y, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage){
        this.name = name;
        this.strength = strength;
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


    public String nearTarget(Unit hero, List<Unit> zlo) {
        int distmin = 1000;
        int dist = 0;
        Unit minindex = zlo.get(0);

        Coordinate distance = new Coordinate();
        for (int i = 0; i < zlo.size(); i++) {
            dist = distance.distance(hero.getX(), hero.getY(), zlo.get(i).getX(), zlo.get(i).getY());

            if (distmin > dist){
                distmin = dist;
                minindex = zlo.get(i);

            }

        }
        return minindex.getInfoCoord();
    }



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
        return "Name: " + this.name + " Type: " + this.getClass().getSimpleName() + " Health: " + this.health + " из " + this.maxhealth + " strength: " + this.strength + " recovery: "
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


}
