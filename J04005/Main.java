package J04005;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String bDay = sc.nextLine();
        double diem1 = sc.nextDouble();
        double diem2 = sc.nextDouble();
        double diem3 = sc.nextDouble();

        Students person = new Students(name, bDay, diem1, diem2, diem3);
        System.out.println(person.toString());
    }
}

