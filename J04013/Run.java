package J04013;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String id = ip.nextLine();
        String name = ip.nextLine();
        double math = ip.nextDouble();
        double physic = ip.nextDouble();
        double chemistry = ip.nextDouble();
        Student person = new Student(id, name, math, physic, chemistry);
        System.out.println(person.toString());
    }
}
