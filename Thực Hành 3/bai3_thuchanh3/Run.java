package bai3_thuchanh3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip =  new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> arr = new ArrayList<>();

        while (ip.hasNextLine()){
            String maSV = ip.nextLine();
            String tenSV = ip.nextLine();
            String lop = ip.nextLine();
            String email = ip.nextLine();
            String sdt = ip.nextLine();
            arr.add(new Student(maSV, tenSV, lop, email, sdt));
        }
        Collections.sort(arr);
        for(Student s : arr) System.out.println(s);
    }
}
