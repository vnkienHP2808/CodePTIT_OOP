package J05020_SapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 0; i < n ; i++){
            list.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(!o1.getLopSV().equals(o2.getLopSV())) return o1.compareTo1(o2);
                return o1.compareTo2(o2);
            }
        });
        for(Student stu : list){
            System.out.println(stu.toString());
        }
    }
}
