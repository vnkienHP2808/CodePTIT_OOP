package J06005_QuanLiBanHang1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        HashMap<String, Customer> map1 = new HashMap<>();
        HashMap<String, Product> map2 = new HashMap<>();
        ArrayList<Bill> arr = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String ma = String.format("KH%03d", i);
            map1.put(ma, new Customer(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String ma = String.format("MH%03d", i);
            map2.put(ma, new Product(ip.nextLine(), ip.nextLine(), Long.parseLong(ip.nextLine()), Long.parseLong(ip.nextLine())));
        }
        int t = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= t; i++){
            String[] input = ip.nextLine().trim().split("\\s+");
            arr.add(new Bill(String.format("HD%03d", i), map1.get(input[0]), map2.get(input[1]), Long.parseLong(input[2])));
        }

        Collections.sort(arr);
        for(Bill bill : arr){
            System.out.println(bill);
        }
    }
}
