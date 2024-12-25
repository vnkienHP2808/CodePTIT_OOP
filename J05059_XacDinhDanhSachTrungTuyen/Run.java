package J05059_XacDinhDanhSachTrungTuyen;


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

        int q = ip.nextInt();
        double x = arr.get(q-1).ketQua();
        System.out.println(String.format("%.1f", x));
        for(Student stu : arr){
            String kq = "TRUNG TUYEN";
            if(stu.ketQua() < x) kq = "TRUOT";
            System.out.println(stu + kq);
        }
    }
}
