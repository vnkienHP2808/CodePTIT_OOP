package J05027_TimKiemGV;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Teacher> arr = new ArrayList<>();
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 1; i <= n; i++){
            arr.add(new Teacher(String.format("GV%02d", i), ip.nextLine(), ip.nextLine()));
        }
        int q = ip.nextInt();
        ip.nextLine();
        while(q-- > 0){
            String input = ip.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + input + ":");
            input = input.toLowerCase();
            for(Teacher teacher : arr){
                if(teacher.getTenGV().contains(input)) System.out.println(teacher.toString());
            }
        }
    }
}
