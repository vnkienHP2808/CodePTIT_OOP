package bai4_thuchanh3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("BAITAP.in"));
        HashMap<String, Student> map = new HashMap<>();
        ArrayList<Student> caSang = new ArrayList<>();
        ArrayList<Student> caChieu = new ArrayList<>();

        while(ip.hasNextLine()){
            String maSV = ip.nextLine();
            String tenSV = ip.nextLine();
            String deTai = ip.nextLine();

            map.put(maSV, new Student(maSV, tenSV, deTai));
        }

        ip = new Scanner(new File("BAOCAO.in"));
        while(ip.hasNextLine()){
            String maSV = ip.nextLine();
            String gioPhut = ip.nextLine();

            int gio = Integer.parseInt(gioPhut.substring(0, 2));

            if(gio < 12) caSang.add(map.get(maSV));
            else caChieu.add(map.get(maSV));
        }
        
    }
}
