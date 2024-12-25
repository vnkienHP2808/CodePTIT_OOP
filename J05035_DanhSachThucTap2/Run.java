package J05035_DanhSachThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 1; i <= n; i++){
            arr.add(new Student(i, ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });
        int q = ip.nextInt();
        while(q-- > 0){
            String doanhNghiep = ip.next();
            for(Student stu : arr){
                if(doanhNghiep.equals(stu.getDN())) System.out.println(stu.toString());
            }
        }
    }
}
