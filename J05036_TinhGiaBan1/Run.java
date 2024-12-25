package J05036_TinhGiaBan1;

import java.util.ArrayList;
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
        for(Product pro : arr){
            System.out.println(pro.toString());
        }
    }
}

