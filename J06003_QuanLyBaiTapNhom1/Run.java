package J06003_QuanLyBaiTapNhom1;

import java.util.ArrayList;
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
        int q = ip.nextInt();
        while(q-- > 0){
            int input = ip.nextInt();
            System.out.println("DANH SACH NHOM " + input + ":");
            for(Student stu : arr){
                if(stu.getNhom() == input) System.out.println(stu);
            }
            System.out.println("Bai tap dang ky: " + group.get(input));
        }
    }
}
