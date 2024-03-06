package Seminar1.Hero_Classes;

import Seminar1.Coordinate.Coordinate;
import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Monk extends Warriors  implements Step {


    public Monk(String name, int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);}
    public Monk (String name, int x, int y) {
            super(name, x, y, 2,35, 30, 2, 5, 3, 20, 50);
    }

    @Override
    public void Step(ArrayList<Unit> targetTeam) {
        if (!Dead(Monk.this)) {
            System.out.println(Monk.this.getInfo() + " Мертв ");
            return;}
        else {
            Coordinate mindist = new Coordinate();
            double mindistance = 0;
            Unit closestHero = (Unit) nearTarget(targetTeam);
            mindistance = mindist.getDistamce(closestHero);
            if (mindistance < 2) {
                Monk.this.Attack(closestHero);
                return;
            }
            Coordinate diff = new Coordinate();
            diff = this.coordinate.getDiff(closestHero.getCoordinate());
            if(this.health < this.maxhealth / 2){
                Monk.this.getHealth();
                System.out.println(Monk.this.getInfo() + " Лечится ");
            }else{
                if (Math.abs(diff.getXposition()) > Math.abs(diff.getYposition())){
                    if (diff.getXposition() < Math.abs(diff.getXposition())){
                        if (targetTeam.contains(getCoordinate(getX()+1,getY()))){
                            return;
                        }else {
                            this.coordinate.setX(getX() + 1);
                        }
                    }else {
                        if (diff.getXposition() == Math.abs(diff.getXposition())){
                            if (targetTeam.contains(getCoordinate(getX()-1,getY()))){
                                return;
                            }else {
                                this.coordinate.setX(getX() - 1);
                            }
                        }
                    }

                }else{
                    if (diff.getYposition() < Math.abs(diff.getYposition())){
                        if (targetTeam.contains(getCoordinate(getX(),getY()+1))){
                            return;
                        }else {
                            this.coordinate.setY(getY() + 1);
                        }
                    }else {
                        if (diff.getYposition() == Math.abs(diff.getYposition())){
                            if (targetTeam.contains(getCoordinate(getX(),getY()-1))){
                                return;
                            }else {
                                this.coordinate.setX(getX() - 1);
                            }
                        }
                    }
                }System.out.println(Monk.this.getInfo() + " Двигается ");
            }



        }
    }



    public void meditate() {
        System.out.println(this.name + " is meditating.");
    }


    public void rest() {
        System.out.println(this.name + " is using their healing powers.");
    }
}