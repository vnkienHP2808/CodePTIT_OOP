package J05045_SapXepNhanVienTheoThuNhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Employee(String.format("NV%02d", i), ip.nextLine(), ip.nextLine(), ip.nextInt(), ip.nextInt()));
        }
        Collections.sort(arr, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if((o2.phuCap()+o2.Luong()) != (o1.phuCap() + o1.Luong())) return (o2.phuCap()+o2.Luong()) - (o1.phuCap() + o1.Luong());
                return o1.compareTo(o2);
            }
        });
        for(Employee person : arr){
            System.out.println(person.toString());
        }
    }
}
