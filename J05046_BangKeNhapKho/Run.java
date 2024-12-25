package J05046_BangKeNhapKho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static String hihi(String s){
        String[] a = s.split("\\s+");
        return a[0].substring(0, 1).toUpperCase() + a[1].substring(0,1).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Product> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            String tenSP = ip.nextLine();
            int soLuong = ip.nextInt();
            int donGia = ip.nextInt();
            String tmp = hihi(tenSP);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            arr.add(new Product(String.format(tmp + "%02d", map.get(tmp)), tenSP, soLuong, donGia));
        }
        for(Product pro : arr){
            System.out.println(pro.toString());
        }
    }
}
