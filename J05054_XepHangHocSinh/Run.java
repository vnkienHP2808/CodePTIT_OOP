package J05054_XepHangHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Student(String.format("HS%02d", i), ip.nextLine(), ip.nextDouble()));
        }
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getDiemTB() < o2.getDiemTB())
                    return 1;
                if(o1.getDiemTB() == o2.getDiemTB())
                    return 0;
                return -1;
            }
        });

        double pos = arr.get(0).getDiemTB();
        int cnt = 0, res = 1;
        for(int i = 0; i < n; i++){
            if(arr.get(i).getDiemTB() == pos){
                cnt++;
            }
            else{
                pos = arr.get(i).getDiemTB();
                res += cnt;
                cnt = 1;
            }
            arr.get(i).setStt(res);
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });

        for(Student stu : arr){
            System.out.println(stu);
        }
    }
}
