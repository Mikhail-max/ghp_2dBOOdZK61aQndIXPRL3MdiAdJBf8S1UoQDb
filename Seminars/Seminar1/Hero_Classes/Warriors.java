package Seminar1.Hero_Classes;

import Seminar1.Coordinate.Coordinate;
import Seminar1.Interface.Step;

import java.util.ArrayList;

public class Warriors extends Unit implements Step {
    public Warriors(String name, int x, int y, int initiative, int health, int strength, int recovery, int protection, int intelligence, int vitality, int damage) {
        super(name, x, y, initiative, health, strength, recovery, protection, intelligence, vitality, damage);
    }


    @Override
    public void Step(ArrayList<Unit> targetTeam) {
        if (!Dead(Warriors.this)) {
            /*System.out.println(Warriors.this.getInfo() + " Мертв ");*/
            targetTeam.remove(Warriors.this);
        } else {
            Coordinate mindist = new Coordinate();
            double mindistance;

            mindistance = mindist.getDistamce(nearTarget(targetTeam));
            if (mindistance < 2) {
                if (!Dead(nearTarget(targetTeam))) {
                    targetTeam.remove(nearTarget(targetTeam));
                } else {
                    Warriors.this.Attack(nearTarget(targetTeam));
                }
            }
            ArrayList<Unit> zlo2 = new ArrayList<>();
            for (Unit element : targetTeam) {
                if (element.getHealth() > 0) {
                    zlo2.add(element);
                }
            }
            if (zlo2.size() > 0) {


                Coordinate diff = this.coordinate.getDiff(nearTarget(targetTeam).getCoordinate());

                if (this.health < this.maxhealth / 2) {
                    Warriors.this.GetHeal(this.getDamage());
                    /* System.out.println(Warriors.this.getInfo() + " Лечится ");*/
                } else {
                    if (Math.abs(diff.getXposition()) > Math.abs(diff.getYposition())) {
                        if (diff.getXposition() < 0) {
                            if (targetTeam.contains(getCoordinate(getX() + 1, getY()))) {
                                return;
                            } else {
                                this.coordinate.setX(getX() + 1);
                            }
                        } else {
                            if (diff.getXposition() > 0) {
                                if (targetTeam.contains(getCoordinate(getX() - 1, getY()))) {
                                    return;
                                } else {
                                    this.coordinate.setX(getX() - 1);
                                }
                            }
                        }

                    } else {
                        if (diff.getYposition() < 0) {
                            if (targetTeam.contains(getCoordinate(getX(), getY() + 1))) {
                                return;
                            } else {
                                this.coordinate.setY(getY() + 1);
                            }
                        } else {
                            if (diff.getYposition() > 0) {
                                if (targetTeam.contains(getCoordinate(getX(), getY() - 1))) {
                                    return;
                                } else {
                                    this.coordinate.setY(getY() - 1);
                                }
                            }
                        }
                    }/*System.out.println(Warriors.this.getInfo() + " Двигается ");*/
                }
            }else {
                    Warriors.this.GetHeal(this.getDamage());
            }
        }
    }
}






