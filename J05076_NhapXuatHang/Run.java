package J05076_NhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<InforProduct> inforProducts = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            products.add(new Product(ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        int m = ip.nextInt();
        for(int i = 1; i <= m; i++){
            String maSP = ip.next();
            Product product = null;
            for(Product pro : products){
                if(pro.maSP.equals(maSP)){
                    product = pro;
                    break;
                }
            }
            inforProducts.add(new InforProduct(maSP, ip.nextLong(), ip.nextLong(), ip.nextLong(), product));
        }

        for(InforProduct info : inforProducts){
            System.out.println(info);
        }
    }
}
