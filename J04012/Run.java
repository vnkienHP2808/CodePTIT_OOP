package J04012;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String id = "NV01";
        String name = ip.nextLine();
        int salary = ip.nextInt();
        int dayWork = ip.nextInt();
        String duty = ip.next();
        Employee person = new Employee(id, name, salary, dayWork, duty);
        System.out.println(person.toString());
    }
}
