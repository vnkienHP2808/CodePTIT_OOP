package J07050_SapXepMatHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("MATHANG.in"));
        ArrayList<Product> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());

        for(int i = 1; i <= n; i++){
            arr.add(new Product(String.format("MH%02d", i), ip.nextLine(),
                    ip.nextLine(),Double.parseDouble(ip.nextLine()), Double.parseDouble(ip.nextLine())));
        }
        Collections.sort(arr);
        for(Product p : arr){
            System.out.println(p);
        }
        ip.close();
    }
}
