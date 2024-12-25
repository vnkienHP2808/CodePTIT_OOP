package bai2_thuchanh3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws ParseException {
        Scanner ip = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            arr.add(new Employee(ip.nextLine().trim(), ip.nextLine().trim(), ip.nextLine().trim(), ip.nextLine().trim()));
        }
        Collections.sort(arr);

        for (Employee e : arr){
            System.out.println(e);
        }
    }
}

