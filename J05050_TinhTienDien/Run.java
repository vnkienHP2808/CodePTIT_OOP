package J05050_TinhTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Customer> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            arr.add(new Customer(String.format("KH%02d", i), ip.next().trim(), ip.nextLong(), ip.nextLong()));
        }
        for(Customer person : arr){
            System.out.println(person.toString());
        }
    }
}
