package J06004_QuanLyBaiTapNhom2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        HashMap<Integer, String> group = new HashMap<>();

        int n = ip.nextInt();
        int m = ip.nextInt();
        ip.nextLine();
        for(int i = 1; i <= n; i++){
            arr.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextLine(), Integer.parseInt(ip.nextLine())));
        }
        for(int i = 1; i <= m; i++){
            String line = ip.nextLine();
            group.put(i, line);
        }
        Collections.sort(arr);
        for(Student stu : arr){
            System.out.println(stu + " " + group.get(stu.getNhom()));
        }
    }
}

