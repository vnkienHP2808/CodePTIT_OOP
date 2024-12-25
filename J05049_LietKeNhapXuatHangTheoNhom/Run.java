package J05049_LietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            String maSP = ip.nextLine();
            long soLuongNhap = ip.nextLong();

            long soLuongXuat;
            long donGia;
            if(maSP.charAt(0) == 'A') soLuongXuat = (long)Math.round((soLuongNhap*6.0/100)*10);
            else soLuongXuat = (long)Math.round((soLuongNhap*7.0/100)*10);

            if(maSP.charAt(maSP.length() - 1) == 'Y') donGia = 110000;
            else donGia = 135000;

            arr.add(new Product(maSP, soLuongNhap, soLuongXuat, donGia));
        }
        Collections.sort(arr);
        String input = ip.next();
        for(Product pro : arr){
            if(pro.getMaSP().equals(input)) System.out.println(pro.toString());
        }
    }
}
