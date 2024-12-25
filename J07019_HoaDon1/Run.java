package J07019_HoaDon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("DATA1.in"));
        HashMap<String, Product> pro = new HashMap<>();
        ArrayList<Bill> bill = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String maSP = ip.nextLine();
            pro.put(maSP, new Product(maSP, ip.nextLine(), Long.parseLong(ip.nextLine()), Long.parseLong(ip.nextLine())));
        }

        ip = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String[] data = ip.nextLine().trim().split("\\s+");
            bill.add(new Bill(String.format(data[0]+"-%03d",i), Long.parseLong(data[1]), pro.get(data[0].substring(0, 2)), Integer.parseInt(data[0].substring(2))));
        }

        for(Bill b : bill){
            System.out.println(b);
        }
        ip.close();
    }
}
