package J05023_LietKeSVTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 0; i < n; i++){
            arr.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        int q = ip.nextInt();
        while(q-- > 0){
            int year = ip.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for(Student stu : arr){
                if(year == Integer.parseInt("20"+stu.getLopSV().substring(1,3))) System.out.println(stu.toString());
            }
        }
    }
}
