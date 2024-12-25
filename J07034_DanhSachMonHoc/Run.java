package J07034_DanhSachMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            arr.add(new Subject(ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        Collections.sort(arr);
        for(Subject s : arr){
            System.out.println(s);
        }
    }
}
