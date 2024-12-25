package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("KH.in"));

        int n = Integer.parseInt(ip.nextLine());
        HashMap<String, Customer> ctm = new HashMap<>();
        HashMap<String, Product> pro = new HashMap<>();
        ArrayList<Bill> bill = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String tmp = String.format("KH%03d", i);
            ctm.put(tmp, new Customer(tmp, ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }

        ip = new Scanner(new File("MH.in"));

        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String tmp = String.format("MH%03d", i);
            pro.put(tmp, new Product(tmp, ip.nextLine(), ip.nextLine(), Integer.parseInt(ip.nextLine()), Integer.parseInt(ip.nextLine())));
        }

        ip = new Scanner(new File("HD.in"));
        int t = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= t; i++){
            String[] input = ip.nextLine().trim().split("\\s+");
            bill.add(new Bill(String.format("HD%03d", i), Integer.parseInt(input[2]), ctm.get(input[0]), pro.get(input[1])));
        }


    }
}
