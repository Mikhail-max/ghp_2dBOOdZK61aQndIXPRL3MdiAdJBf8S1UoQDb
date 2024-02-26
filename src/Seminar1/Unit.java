package Seminar1;

import java.util.Random;

abstract class Unit {
    protected int health, maxhealth, strength, recovery, vitality, maxvitality, intelligence, damage, protection;
    protected String name;
    public Unit(String name, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage){
        this.name = name;
        this.strength = strength;
        this.recovery = recovery;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.maxvitality = vitality;
        this.health = health;
        this.maxhealth = health;
        this.damage = damage;
        this.protection = protection;
    }
    public String getName()      { return name; }



    public String getInfo() {
        return "Name: " + this.name + " Type: " + this.getClass().getSimpleName() + " Health: " + this.health + " из " + this.maxhealth;

    }

    public void GetDamage(int damage) {
        if (damage > protection) {
            damage = damage - protection;
            if (this.health - damage > 0) {
                this.health -= damage;
            } else {
                System.out.println("Ваш персонаж умер");
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
