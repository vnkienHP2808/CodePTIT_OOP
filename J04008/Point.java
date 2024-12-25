package J04008;


import java.text.DecimalFormat;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point secondPoint){
        return Math.sqrt((this.x - secondPoint.getX())*(this.x - secondPoint.getX()) + (this.y - secondPoint.getY())*(this.y - secondPoint.getY()));
    }
    public double distance(Point p1, Point p2){
        return p1.distance(p2);
    }

    public boolean check(Point p1, Point p2, Point p3){
        double edge1 = distance(p1, p2);
        double edge2 = distance(p1, p3);
        double edge3 = distance(p2, p3);
        if(edge1 + edge2 <= edge3 || edge2 + edge3 <= edge1 || edge1 + edge3 <= edge2){
            return false;
        }
        return true;
    }

    public String toString(Point p1, Point p2, Point p3){
        DecimalFormat df = new DecimalFormat(".000");
        if(check(p1, p2, p3)) return df.format(distance(p1, p2) + distance(p1, p3) + distance(p2, p3));
        else return "INVALID";
    }

}
