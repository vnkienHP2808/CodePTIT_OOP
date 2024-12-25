package J07020_HoaDon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("KH.in"));
        HashMap<String, Customer> cus = new HashMap<>();
        HashMap<String, Product> pro = new HashMap<>();
        ArrayList<Bill> bill = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String maKH = String.format("KH%03d", i);
            cus.put(maKH, new Customer(maKH, ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }

        ip = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String maSP = String.format("MH%03d", i);
            pro.put(maSP, new Product(maSP, ip.nextLine(), ip.nextLine(), Long.parseLong(ip.nextLine()), Long.parseLong(ip.nextLine())));
        }

        ip = new Scanner(new File("HD.in"));
        int p = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= p; i++){
            String[] data = ip.nextLine().trim().split("\\s+");
            bill.add(new Bill(String.format("HD%03d", i), data[0], data[1], Integer.parseInt(data[2]), cus.get(data[0]), pro.get(data[1])));
        }

        for(Bill b : bill) System.out.println(b);
        ip.close();
    }
}
