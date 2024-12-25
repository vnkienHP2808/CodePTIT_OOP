package J05065_LietKeNhanVienTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        int gd = 0, tp = 0, pp = 0;
        for(int i = 1; i <= n; i++){
            String[] a = ip.nextLine().trim().split("\\s+");
            String chucVu = a[0].substring(0, 2);
            String heSoLuong = a[0].substring(2, 4);
            String soHieu = a[0].substring(4);

            String ten = "";
            for(int j = 1; j < a.length; j++){
                ten += a[j] + " ";
            }

            if(chucVu.equals("GD")){
                if(gd == 0){
                    gd++;
                }
                else{
                    chucVu = "NV";
                }
            }
            if(chucVu.equals("TP")){
                if(tp < 3){
                    tp++;
                }
                else{
                    chucVu = "NV";
                }
            }
            if(chucVu.equals("PP")){
                if(pp < 3){
                    pp++;
                }
                else chucVu = "NV";
            }

            arr.add(new Employee(chucVu, heSoLuong, soHieu, ten));
        }

        Collections.sort(arr);

        int q = ip.nextInt();
        while(q-- > 0){
            String str = ip.next();
            for(Employee employee : arr){
                if(employee.getChucVu().equals(str)) System.out.println(employee);
            }
            System.out.println();
        }
    }
}
