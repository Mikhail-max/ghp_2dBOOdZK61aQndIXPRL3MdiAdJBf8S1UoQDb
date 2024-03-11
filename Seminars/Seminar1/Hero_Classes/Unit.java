package Seminar1.Hero_Classes;

import Seminar1.Coordinate.Coordinate;
import Seminar1.Interface.Step;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit implements Step {
    protected int health, maxhealth, strength, recovery, vitality, intelligence, damage, protection;
    protected String name;
    protected Coordinate coordinate;
    int x;
    int y;

    public Unit() {

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

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
    public Coordinate getCoordinate(int x, int y){
        this.x = x;
        this.y = y;
        return coordinate(this.x,this.y);
    }
    public ArrayList<Integer> getCoordinateMass(){
        this.x = x;
        this.y = y;
        ArrayList<Integer> coord = new ArrayList<>();
        coord.add(x);
        coord.add(y);
        return coord;


    }

    private Coordinate coordinate(int x, int y) {
        return null;
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
        coordinate = new Coordinate(this.getX(),this.getY());
    }
    public Unit(String name, int x, int y){

    }



    public String getName()      { return name; }


    public int getInitiative() {
        return initiative;
    }

    public Unit nearTarget(List<Unit> zlo) {
        double distmin = 1000.0;
        double dist = (double) 0;
        int minind = 0;
        Unit minindexhero = new Unit() {
        };
        ArrayList<Unit> zlo2 = new ArrayList<>();
        for (Unit element:zlo){
            if (element.getHealth() > 0){
                zlo2.add(element);
            }
        }

        Coordinate distance = new Coordinate();
        for (int i = 0; i < zlo2.size(); i++) {
                dist = distance.distance(this.getX(), this.getY(), zlo2.get(i).getX(), zlo2.get(i).getY());

                if (distmin > dist ){
                    distmin = dist;
                    minind = i;
                    minindexhero = zlo2.get(minind);

                }


        }
        distmin = 1000.0;
        dist = (double) 0;
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
        return this.getClass().getSimpleName() + "Name: " + this.name  + " Health: " + this.health + " из " + this.maxhealth + " x:" + getCoordinate().getXposition() + " y:" + getCoordinate().getYposition();

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
        return "Name: " + this.name + " Type: " + this.getClass().getSimpleName() +
                " Health: " + this.health + " из " + this.maxhealth +
                " x:" + getCoordinate().getXposition() +
                " y:" + getCoordinate().getYposition();

    }

    public void GetDamage(int damage) {
        if (damage > protection) {
            damage = damage - protection;
            if (this.health - damage > 0) {
                this.health -= damage;
                /*System.out.println("Персонаж " + this.getInfo() + " получил " + damage + " урона ");*/
            } else {
                this.health = 0;
               /* System.out.println("Персонаж " + this.name + " умер");*/
            }
        }
    }
    public void Attack(Unit target) {
        if (!Dead(Unit.this)) {
            /*System.out.println(Unit.this.getInfo() + " Мертв ");*/
        } else {
           /* System.out.printf("%s Атакует персонажа:  %s \n", Unit.this.getInfo(), target.getInfo());*/

            target.GetDamage(this.damage);
        }
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
            /*System.out.printf("%s dead.", target.getName());*/
            return false;

    }else{        return true;}}


    @Override
    public void Step(ArrayList<Unit> targetTeam) {

    }
}
