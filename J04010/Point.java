package J04010;

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
    public boolean check(Point p1, Point p2, Point p3){
        double edge1 = p1.distance(p2);
        double edge2 = p1.distance(p3);
        double edge3 = p2.distance(p3);
        if(edge1 + edge2 <= edge3 || edge2 + edge3 <= edge1 || edge1 + edge3 <= edge2){
            return false;
        }
        return true;
    }

    public double R(Point p1, Point p2, Point p3){
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        return (a*b*c)/(Math.sqrt((a + b + c) * (a + b - c ) * (-a + b + c) * (a - b + c)));
    }
    public String toString(Point p1, Point p2, Point p3){
        if(check(p1, p2, p3)){
            DecimalFormat dp = new DecimalFormat(".000");
            return dp.format(Math.PI*Math.pow(R(p1,p2,p3), 2));
        }
        return "INVALID";
    }
}
