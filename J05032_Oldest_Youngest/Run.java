package J05032_Oldest_Youngest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 0; i < n; i++){
            arr.add(new Person(ip.next(), ip.next()));
        }

        Collections.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(arr.get(n-1).toString());
        System.out.println(arr.get(0).toString());
    }
}
