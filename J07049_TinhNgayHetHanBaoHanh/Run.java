package J07049_TinhNgayHetHanBaoHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("MUAHANG.in"));
        ArrayList<Product> l1 = new ArrayList<>();
        ArrayList<Customer> l2 = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 0; i < n; i++){
            l1.add(new Product(ip.nextLine(), ip.nextLine(), Integer.parseInt(ip.nextLine()), Integer.parseInt(ip.nextLine())));
        }

        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String tenKH = ip.nextLine();
            String diaChi = ip.nextLine();
            String maSP1 = ip.nextLine();
            int soLuong1 = Integer.parseInt(ip.nextLine());
            String ngayMua = ip.nextLine();

            Product product = null;
            for(Product pro : l1){
                if(pro.getMaSP().equals(maSP1)){
                    product = pro;
                    break;
                }
            }
            l2.add(new Customer(String.format("KH%02d", i), tenKH, diaChi, maSP1, soLuong1, ngayMua, product));
        }

        l2.sort(Comparator.comparing(Customer::getEndDate).thenComparing(Customer::getMaKH));

        for(Customer person : l2){
            System.out.println(person);
        }
    }
}


