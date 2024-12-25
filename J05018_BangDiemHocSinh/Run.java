package J05018_BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            in.nextLine();
            String tmp = String.format("HS%02d", i);
            list.add(new Student(i, tmp, in.nextLine(), in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()));
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int diemTB1 = (int)(o1.getAverage()*10);
                int diemTB2 = (int)(o2.getAverage()*10);
                if(diemTB1 != diemTB2) return diemTB2 - diemTB1;
                return o1.getStt() - o2.getStt();
            }
        });
        for(Student stu : list){
            System.out.println(stu.toString());
        }
    }
}
