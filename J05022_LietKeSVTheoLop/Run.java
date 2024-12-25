package J05022_LietKeSVTheoLop;

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
            String str = ip.next();
            System.out.println("DANH SACH SINH VIEN LOP " + str + ":");
            for(Student stu : arr){
                if(stu.getLopSV().equals(str)) System.out.println(stu.toString());
            }
        }
    }
}
