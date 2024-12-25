package J05006_DanhSachDoiTuongNV;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        for(int i = 1; i <= n; i++){
            String id = String.format("%05d", i);
            Employee employee = new Employee(id, ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine());
            System.out.println(employee.toString());
        }
    }
}

