package bai5_thuchanh3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("MONHOC.in"));
        ArrayList<String> teacher = new ArrayList<>();
        HashMap<String, Teacher> tea = new HashMap<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String line = ip.nextLine();
        }

        ip = new Scanner(new File("GIANGVIEN.in"));
        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String[] data = ip.nextLine().trim().split("\\s+");
            String tenGV = "";
            for(int j = 1; j < data.length; j++) tenGV += data[j] + " ";
            tea.put(data[0], new Teacher(data[0], tenGV.trim()));
            teacher.add(data[0]);
        }

        ip = new Scanner(new File("GIOCHUAN.in"));
        int t = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= t; i++){
            String[] data = ip.nextLine().trim().split("\\s+");
            tea.get(data[0]).setGioDay(tea.get(data[0]).getGioDay() + Double.parseDouble(data[2]));
        }

        for(String s : teacher){
            System.out.println(tea.get(s));
        }
    }
}
