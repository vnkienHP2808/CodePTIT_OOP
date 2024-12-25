package J05038_BangKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Employee(String.format("NV%02d", i), ip.nextLine(), ip.nextInt(), ip.nextInt(), ip.next()));
        }
        int total = 0;
        for(Employee emp : arr){
            System.out.println(emp.toString());
            total += emp.thucLinh();
        }
        System.out.println("Tong chi phi tien luong: " + total);
    }
}
