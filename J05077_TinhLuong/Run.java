package J05077_TinhLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Work> works = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            String[] a = ip.nextLine().split("\\s+");
            String maPhong = a[0];
            String tenPhong = "";
            for(int j = 1; j < a.length; j++) tenPhong += a[j] + " ";
            works.add(new Work(maPhong, tenPhong));
        }
        int m = ip.nextInt();
        for(int i = 1; i <= m; i++){
            ip.nextLine();
            String maNV = ip.nextLine();
            String tenNV = ip.nextLine();
            long luongCB = ip.nextLong();
            long soNC = ip.nextLong();

            Work work = null;
            for(Work w : works){
                if(w.getMaPhong().equals(maNV.substring(3))){
                    work = w;
                    break;
                }
            }
            employees.add(new Employee(maNV, tenNV, luongCB, soNC, work));
        }

        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
