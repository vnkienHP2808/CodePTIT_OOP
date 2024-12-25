package J05021_SapXepTheoMaSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while(ip.hasNext()){
            list.add(new Student(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });
        for(Student stu : list){
            System.out.println(stu.toString());
        }
    }
}