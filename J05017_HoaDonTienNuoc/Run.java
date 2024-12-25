package J05017_HoaDonTienNuoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Customer> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Customer(String.format("KH%02d", i), ip.nextLine(), ip.nextInt(), ip.nextInt()));
        }
        Collections.sort(arr);
        for(Customer  customer : arr)
            System.out.println(customer);
    }
}
