package J05026_DanhSachGVTheoBoMon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static String rutGon1(String s){
        String[] a = s.split("\\s+");
        String tmp = "";
        for(int i = 0; i < a.length; i++){
            tmp += a[i].substring(0, 1).toUpperCase();
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Teacher> list = new ArrayList<>();
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 1; i <= n; i++){
            list.add(new Teacher(String.format("GV%02d", i), ip.nextLine(), ip.nextLine()));
        }

        int q = ip.nextInt();
        ip.nextLine();
        while(q-- > 0){
            String input = ip.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + rutGon1(input) + ":");
            for(Teacher teacher : list){
                if (teacher.getChuyenNganh().equals(input)) System.out.println(teacher.toString());
            }
        }
    }
}
