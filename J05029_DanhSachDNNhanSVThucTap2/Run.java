package J05029_DanhSachDNNhanSVThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Company> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 0; i < n; i++){
            ip.nextLine();
            arr.add(new Company(ip.nextLine(), ip.nextLine(), ip.nextInt()));
        }
        Collections.sort(arr, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                if(o2.getSoLuong() != o1.getSoLuong()) return o2.getSoLuong() - o1.getSoLuong();
                return o1.compareTo(o2);
            }
        });
        int q = ip.nextInt();
        while(q-- > 0){
            int a = ip.nextInt();
            int b = ip.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(Company cpn : arr){
                if(cpn.getSoLuong() >= a && cpn.getSoLuong() <= b) System.out.println(cpn.toString());
            }
        }
    }
}
