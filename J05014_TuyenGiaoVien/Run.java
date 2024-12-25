package J05014_TuyenGiaoVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Teacher> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Teacher(String.format("GV%02d", i), ip.nextLine(), ip.nextLine(), ip.nextDouble(), ip.nextDouble()));
        }
        Collections.sort(arr);
        for(Teacher teacher : arr){
            System.out.println(teacher);
        }
    }
}
