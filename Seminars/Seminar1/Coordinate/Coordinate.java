package Seminar1.Coordinate;

import Seminar1.Hero_Classes.Unit;

import java.util.ArrayList;

public class Coordinate {
    int x,y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXposition() {
        return x;
    }

    public int getYposition() {
        return y;
    }



    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Coordinate() {
        this.x = x;
        this.y = y;
    }

    public Double distance(double x1, double y1, double x2, double y2){
        double dist;
        return dist = (double) (Math. sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

    }
    public Double getDistamce(Unit target){
        double targetDistance = 0;
        return targetDistance = Math.sqrt(Math.pow(target.getX() - this.getXposition(), 2)
                + Math.pow(target.getY() - this.getYposition(), 2));

    }
    public Coordinate getDiff (Coordinate targetPos){
        return  new Coordinate(x - targetPos.getXposition(),y - targetPos.getYposition());
    }

}
