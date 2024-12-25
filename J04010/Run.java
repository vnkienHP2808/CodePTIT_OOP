package J04010;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            double x1 = ip.nextDouble();
            double y1 = ip.nextDouble();
            double x2 = ip.nextDouble();
            double y2 = ip.nextDouble();
            double x3 = ip.nextDouble();
            double y3 = ip.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            System.out.println(p1.toString(p1, p2, p3));
        }
    }
}
