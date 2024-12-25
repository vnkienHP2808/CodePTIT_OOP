package J05042_BangXepHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("LUYENTAP.in"));
        ArrayList<Student> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Student(ip.nextLine(), ip.nextInt(), ip.nextInt()));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getSoBaiDung() != o2.getSoBaiDung()) return o2.getSoBaiDung() - o1.getSoBaiDung();
                if(o1.getSoLuotSubmit() != o2.getSoLuotSubmit()) return o1.getSoLuotSubmit() - o2.getSoLuotSubmit();
                return o1.compareTo(o2);
            }
        });
        for(Student stu : arr){
            System.out.println(stu.toString());
        }
    }
}
