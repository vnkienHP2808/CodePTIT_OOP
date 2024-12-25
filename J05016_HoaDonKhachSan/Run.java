package J05016_HoaDonKhachSan;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws ParseException {
        Scanner ip = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            arr.add(new Person(String.format("KH%02d", i), ip.nextLine().trim(), ip.nextLine().trim(), ip.nextLine().trim(), ip.nextLine().trim(), Long.parseLong(ip.nextLine().trim())));
        }

        Collections.sort(arr);

        for (Person person : arr)
            System.out.println(person);

    }
}
