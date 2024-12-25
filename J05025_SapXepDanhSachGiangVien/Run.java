package J05025_SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Teacher> list = new ArrayList<>();
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 1; i <= n; i++){
            list.add(new Teacher(String.format("GV%02d", i), ip.nextLine(), ip.nextLine()));
        }

        Collections.sort(list, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if(!o1.getTen().equals(o2.getTen())) return o1.compareTo1(o2);
                return o1.compareTo2(o2);
            }
        });

        for(Teacher teacher : list){
            System.out.println(teacher.toString());
        }
    }
}
