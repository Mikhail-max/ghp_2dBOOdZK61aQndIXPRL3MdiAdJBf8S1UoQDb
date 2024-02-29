package Seminar1.Coordinate;

public class Coordinate {
    int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
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

    public Integer distance(int x1, int y1, int x2, int y2){
        int dist;
        return dist = (int) (Math. sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

    }

}
