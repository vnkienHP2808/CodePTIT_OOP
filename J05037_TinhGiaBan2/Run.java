package J05037_TinhGiaBan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Product(String.format("MH%02d", i), ip.nextLine(), ip.nextLine(), ip.nextInt(), ip.nextInt()));
        }

        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getGiaBan() - o1.getGiaBan();
            }
        });

        for(Product pro : arr){
            System.out.println(pro.toString());
        }
    }
}
