package J05044_LietKeNhanVienTheoChucVu;


import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Employee(ip.nextLine(), ip.next(), ip.nextInt(), ip.nextInt()));
        }
        String input = ip.next();
        for (Employee emp : arr){
            if(emp.getChucVu().equals(input)) System.out.println(emp.toString());
        }
    }
}
