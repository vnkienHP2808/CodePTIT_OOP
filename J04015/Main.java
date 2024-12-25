package J04015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String id = ip.nextLine();
        String name = ip.nextLine();
        int salary = ip.nextInt();
        Teachers person = new Teachers(id, name, salary);
        System.out.println(person.toString());
    }
}
