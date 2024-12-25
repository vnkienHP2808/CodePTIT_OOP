package J06007_BangTinhGIoChuan;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Teacher> map2 = new HashMap<>();
        HashMap<Teacher, Double> info = new HashMap<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            ip.nextLine();
        }
        int m = Integer.parseInt(ip.nextLine());
        for (int i = 1; i <= m; i++) {
            String[] data = ip.nextLine().trim().split("\\s+");
            String maGV = data[0];
            if(!arr.contains(maGV)) arr.add(maGV);
            StringBuilder ten = new StringBuilder();
            for (int j = 1; j < data.length; j++) {
                ten.append(data[j]).append(" ");
            }
            map2.put(maGV, new Teacher(maGV, ten.toString().trim()));
        }
        int t = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= t; i++){
            String[] input = ip.nextLine().trim().split("\\s+");
            info.put(map2.get(input[0]), info.getOrDefault(map2.get(input[0]), 0.0) + Double.parseDouble(input[2]));
        }
        DecimalFormat df = new DecimalFormat(".00");
        for(String s : arr){
            System.out.println(map2.get(s).getTenGV() + " " + df.format(info.get(map2.get(s))));
        }
    }
}

