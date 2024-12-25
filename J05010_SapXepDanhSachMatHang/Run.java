package J05010_SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n =  in.nextInt();
        for(int i = 1; i <= n; i++){
            in.nextLine();
            arr.add(new Product(i, in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble()));
        }

        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o2.getLoiNhuan()*10) - (int)(o1.getLoiNhuan()*10);
            }
        });
        for(Product pro: arr){
            System.out.println(pro.toString());
        }
    }
}
