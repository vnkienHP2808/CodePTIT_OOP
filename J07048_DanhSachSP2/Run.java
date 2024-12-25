package J07048_DanhSachSP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("SANPHAM.in"));
        ArrayList<Product> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());

        for(int i = 1; i <= n; i++){
            arr.add(new Product(ip.nextLine(), ip.nextLine() , Integer.parseInt(ip.nextLine()), Integer.parseInt(ip.nextLine())));
        }

        Collections.sort(arr);
        for(Product p : arr){
            System.out.println(p);
        }
        ip.close();
    }
}
