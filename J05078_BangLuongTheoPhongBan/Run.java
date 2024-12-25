package J05078_BangLuongTheoPhongBan;

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
            for(int j = 1; j < a.length; j++) {
                tenPhong += a[j];
                if (j != a.length - 1) tenPhong += " ";
            }
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

        String input = ip.next();
        for(Work work : works){
            if(input.equals(work.getMaPhong())){
                System.out.println("Bang luong phong " + work.getTenPhong() + ":");
                break;
            }
        }

        for (Employee employee : employees){
            if(employee.getWork().getMaPhong().equals(input)) System.out.println(employee);
        }
    }
}
