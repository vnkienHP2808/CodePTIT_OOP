package J05004_DanhSachDoiTuongSV2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        for(int i = 1; i <= test; i++){
            ip.nextLine();
            Student stu = new Student(ip.nextLine().trim(), ip.next(), ip.next(), ip.nextDouble());
            String id = "B20DCCN" + String.format("%03d", i);
            stu.setId(id);
            System.out.println(stu.toString());
        }
    }
}
