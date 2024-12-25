package J07010_DanhSachSVtrongFile2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("SV.in"));
        ArrayList<Student> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            arr.add(new Student(String.format("B20DCCN%03d", i), ip.nextLine(), ip.nextLine(), ip.nextLine(), Double.parseDouble(ip.nextLine())));
        }
        for(Student stu : arr){
            System.out.println(stu);
        }
    }
}
