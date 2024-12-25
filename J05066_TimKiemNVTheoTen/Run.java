package J05066_TimKiemNVTheoTen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String[] a = ip.nextLine().trim().split("\\s+");
            String chucVu = a[0].substring(0, 2);
            String heSoLuong = a[0].substring(2, 4);
            String soHieu = a[0].substring(4);

            StringBuilder ten = new StringBuilder();
            for(int j = 1; j < a.length; j++){
                ten.append(a[j]);
                if(j != a.length-1) ten.append(" ");
            }

            if(chucVu.equals("GD")){
                if(soHieu.compareTo("001") > 0) chucVu = "NV";
            }
            if(chucVu.equals("TP")){
                if(soHieu.compareTo("003") > 0) chucVu = "NV";
            }
            if(chucVu   .equals("PP")){
                if(soHieu.compareTo("003") > 0) chucVu = "NV";
            }

            arr.add(new Employee(chucVu, heSoLuong, soHieu, ten.toString()));
        }

        Collections.sort(arr);

        int q = Integer.parseInt(ip.nextLine());
        while(q-- > 0){
            String str = ip.nextLine().trim().toLowerCase();
            for(Employee employee : arr){
                String ten = employee.getTenNV().toLowerCase();
                if(ten.contains(str)) System.out.println(employee);
            }
            System.out.println();
        }
    }
}

