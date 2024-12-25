package J05082_DanhSachKhachHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Customer> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            arr.add(new Customer(String.format("KH0%02d", i), ip.nextLine().trim(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }

        Collections.sort(arr);
        for(Customer customer : arr){
            System.out.println(customer);
        }
    }
}
