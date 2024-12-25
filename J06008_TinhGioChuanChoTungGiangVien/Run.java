package J06008_TinhGioChuanChoTungGiangVien;

import java.lang.annotation.Target;
import java.text.DecimalFormat;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        HashMap<String, Subject> sub = new HashMap<>();
        HashMap<String, Teacher> tea = new HashMap<>();
        ArrayList<Pair<String, Pair<String, String>>> info = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String[] data = ip.nextLine().trim().split("\\s+");
            String tenMH = "";
            for(int j = 1; j < data.length; j++) tenMH += data[j] + " ";
            sub.put(data[0], new Subject(data[0], tenMH.trim()));
        }

        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String[] data = ip.nextLine().trim().split("\\s+");
            String tenGV = "";
            for(int j = 1; j < data.length; j++) tenGV += data[j] + " ";
            tea.put(data[0], new Teacher(data[0], tenGV.trim()));
        }

        int t = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= t; i++){
            String[] data = ip.nextLine().trim().split("\\s+");
            info.add(new Pair<String, Pair<String, String>>(data[0], new Pair<>(data[1], data[2])));
        }

        String input = ip.nextLine();
        System.out.println("Giang vien: " + tea.get(input).getTenGV());
        double total = 0;
        for(Pair<String, Pair<String, String>> x : info){
            if(x.getFirst().equals(input)){
                System.out.println(sub.get(x.getSecond().getFirst()).getTenMH() + " " + x.getSecond().getSecond());
                total += Double.parseDouble(x.getSecond().getSecond());
            }
        }
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Tong: " + df.format(total));

    }
}