package J05060_KetQuaXetTuyen;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Person(String.format("PH%02d", i), ip.nextLine(), ip.nextLine(), ip.nextDouble(), ip.nextDouble()));
        }
        for (Person person : arr){
            System.out.println(person);
        }
    }
}
