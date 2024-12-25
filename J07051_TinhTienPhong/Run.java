package J07051_TinhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Customer> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());

        for(int i = 1; i <= n; i++){
            arr.add(new Customer(String.format("KH%02d", i), ip.nextLine().trim(), ip.nextLine().trim(), ip.nextLine().trim(), ip.nextLine().trim(), Integer.parseInt(ip.nextLine().trim())));
        }

        Collections.sort(arr);
        for (Customer c : arr){
            System.out.println(c);
        }

        ip.close();
    }
}
