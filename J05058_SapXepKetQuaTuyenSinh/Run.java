package J05058_SapXepKetQuaTuyenSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int n = ip.nextInt();
        for (int i = 1; i <= n; i++) {
            ip.nextLine();
            arr.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextDouble(), ip.nextDouble(), ip.nextDouble()));
        }

        Collections.sort(arr);
        for (Student stu : arr) {
            System.out.println(stu);
        }
    }
}