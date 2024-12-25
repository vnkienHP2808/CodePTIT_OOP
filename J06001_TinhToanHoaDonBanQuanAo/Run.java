package J06001_TinhToanHoaDonBanQuanAo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        HashMap<String, Product> map = new HashMap<>();
        ArrayList<Bill> bills = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String maSP = ip.nextLine();
            String tenSP = ip.nextLine();
            long gia1 = Long.parseLong(ip.nextLine());
            long gia2 = Long.parseLong(ip.nextLine());
            map.put(maSP, new Product(maSP, tenSP, gia1, gia2));
        }
        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String[] input = ip.nextLine().split("\\s+");
            String bonus = String.format("-%03d", i);
            bills.add(new Bill(input[0] + bonus, Long.parseLong(input[1]), map.get(input[0].substring(0, 2))));
        }
        Collections.sort(bills);
        for(Bill bill : bills){
            System.out.println(bill);
        }
    }
}
