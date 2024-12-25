package J05041_SapXepBangTinhCong;

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
            arr.add(new Employee(String.format("NV%02d", i), ip.nextLine(), ip.nextInt(), ip.nextInt(), ip.next()));
        }

        Collections.sort(arr, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.thucLinh() - o1.thucLinh();
            }
        });

        for(Employee emp : arr){
            System.out.println(emp.toString());
        }
    }
}
