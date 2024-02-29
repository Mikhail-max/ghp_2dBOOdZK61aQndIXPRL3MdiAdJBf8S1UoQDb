package Seminar1.Hero_Classes;

import Seminar1.Coordinate.Coordinate;

public class Crossbowman extends Unit{
    public Crossbowman(String name,int x, int y, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, health, strength, recovery, protection, intelligence, vitality, damage);
    }


    public Crossbowman(String name, int x, int y){
        super(name, x, y, 80, 20, 20, 1, 3, 20, 40);
    }



    public void reload() {
        System.out.println(this.name + " is reloading their crossbow.");
    }


    public void fire() {
        System.out.println(this.name + " is firing their crossbow.");
    }

}

