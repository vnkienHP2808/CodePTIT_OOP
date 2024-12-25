package J05012_TinhTien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n =ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Product(ip.nextLine(), ip.nextLine(), ip.nextLong(), ip.nextLong(), ip.nextLong()));
        }
        Collections.sort(arr);
        for(Product pro : arr){
            System.out.println(pro);
        }
    }
}
