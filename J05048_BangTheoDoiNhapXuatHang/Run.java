package J05048_BangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 1; i <= n; i++){
            String maSP = ip.nextLine();
            long soLuongNhap = ip.nextLong();

            long soLuongXuat;
            long donGia;
            if(maSP.charAt(0) == 'A') soLuongXuat = (long)Math.round((soLuongNhap*6.0/100)*10);
            else soLuongXuat = (long)Math.round((soLuongNhap*7.0/100)*10);

            if(maSP.charAt(maSP.length() - 1) == 'Y') donGia = 110000;
            else donGia = 135000;


            arr.add(new Product(maSP, soLuongNhap, soLuongXuat, donGia));
            ip.nextLine();
        }
        for(Product pro : arr){
            System.out.println(pro.toString());
        }
    }
}
