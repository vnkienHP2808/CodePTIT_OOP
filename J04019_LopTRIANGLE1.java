import java.text.DecimalFormat;
import java.util.Scanner;

class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static  Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }

    public double distance(Point p2){
        return Math.sqrt((this.x-p2.x)*(this.x-p2.x)+(this.y-p2.y)*(this.y-p2.y));
    }
}

class Triangle{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public boolean valid(){
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        if(a+b > c && a+c > b && b+c > a) return true;
        return false;
    }

    public double Perimeter(){
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        return a+b+c;
    }
    public String getPerimeter(){
        DecimalFormat df = new DecimalFormat(".000");
        return df.format(Perimeter());
    }
}

public class J04019_LopTRIANGLE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
