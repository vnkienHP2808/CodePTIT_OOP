package J05052_TraCuuDonHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 0; i < n; i++){
            ip.nextLine();
            arr.add(new Product(ip.nextLine(), ip.next(), ip.nextLong(), ip.nextLong()));
        }

        for(Product pro : arr){
            System.out.println(pro);
        }
    }
}
