package J04006;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        String lop = ip.next();
        String bDay = ip.next();
        double gpa = ip.nextDouble();
        Students person = new Students(name, lop, bDay, gpa);
        System.out.println(person.toString());
    }
}
