package J05056_XepHangVDV2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Person(String.format("VDV%02d", i), ip.nextLine(), ip.next(), ip.next(), ip.next()));
        }
        Collections.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.thanhTichXepHang() - o2.thanhTichXepHang();
            }
        });

        double pos = arr.get(0).thanhTichXepHang();
        int cnt = 0, res = 1;
        for(int i = 0; i < n; i++){
            if(arr.get(i).thanhTichXepHang() == pos){
                cnt++;
            }
            else{
                pos = arr.get(i).thanhTichXepHang();
                res += cnt;
                cnt = 1;
            }
            arr.get(i).setStt(res);
        }

        for(Person person : arr){
            System.out.println(person);
        }
    }
}
