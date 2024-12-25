import java.util.Scanner;

public class J04001_KhaiBaoLopPoint {
    private double x;
    private double y;

    public J04001_KhaiBaoLopPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public J04001_KhaiBaoLopPoint(){
    }

    public double distance(J04001_KhaiBaoLopPoint secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x,2) + Math.pow(this.y - secondPoint.y, 2));
    }

    public double distance(J04001_KhaiBaoLopPoint point1, J04001_KhaiBaoLopPoint point2){
        return point1.distance(point2);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            double x1 = ip.nextDouble();
            double y1 = ip.nextDouble();
            double x2 = ip.nextDouble();
            double y2 = ip.nextDouble();
            J04001_KhaiBaoLopPoint point1 = new J04001_KhaiBaoLopPoint(x1, y1);
            J04001_KhaiBaoLopPoint point2 = new J04001_KhaiBaoLopPoint(x2, y2);
            System.out.printf("%.4f", point1.distance(point1, point2));
            System.out.println();
        }
    }
}
