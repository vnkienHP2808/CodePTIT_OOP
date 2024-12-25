package J05081_DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> arrayList = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            String id = "MH" + String.format("%03d", i);
            arrayList.add(new Product(id, ip.nextLine(), ip.nextLine(), ip.nextInt(), ip.nextInt(), i));
        }
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.profit() != o2.profit()) return o2.profit() - o1.profit();
                return o1.getStt() - o2.getStt();
            }
        });
        for(Product prd : arrayList){
            System.out.println(prd.toString());
        }
    }
}



