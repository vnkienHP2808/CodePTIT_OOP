package J05067_QuanLiKhoXangDau;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Fuel> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 0; i < n; i++){
            arr.add(new Fuel(ip.next(), ip.nextLong()));
        }

        for(Fuel f : arr){
            System.out.println(f);
        }
    }
}
