package J07046_DanhSachLuuTru;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws Exception {
        Scanner ip = new Scanner(new File("KHACH.in"));
        ArrayList<Customer> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            arr.add(new Customer(String.format("KH%02d", i), ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        Collections.sort(arr);
        for(Customer c : arr){
            System.out.println(c);
        }
        ip.close();
    }
}
