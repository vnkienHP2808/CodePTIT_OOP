package J04007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        String id = "00001";
        String sex = ip.nextLine();
        String birthday = ip.nextLine();
        String address = ip.nextLine();
        String code = ip.next();
        String day = ip.next();
        Employees person = new Employees(name, id, sex, birthday, address, code, day);
        System.out.println(person.toString());
    }
}
