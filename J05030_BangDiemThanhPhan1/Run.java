package J05030_BangDiemThanhPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextDouble(), ip.nextDouble(), ip.nextDouble()));
        }

        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });

        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + arr.get(i-1).toString());
        }
    }
}
