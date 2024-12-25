package J05057_BangDiemTuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextDouble(), ip.nextDouble(), ip.nextDouble()));
        }
        for(Student stu : arr){
            System.out.println(stu);
        }
    }
}
