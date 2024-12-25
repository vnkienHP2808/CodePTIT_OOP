package J05064_BangThuNhapGiaoVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Teacher> arr = new ArrayList<>();
        int n = ip.nextInt();
        int cnt1 = 0, cnt2 = 0;
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            String maGV = ip.nextLine();
            String tenGV = ip.nextLine();
            int luong = ip.nextInt();

            String tmp = maGV.substring(0,2);
            if(tmp.equals("HT")){
                if(cnt1 == 0){
                    arr.add(new Teacher(maGV, tenGV, luong));
                    cnt1++;
                }
            }
            else if(tmp.equals("HP")){
                if(cnt2 < 2){
                    arr.add(new Teacher(maGV, tenGV, luong));
                    cnt2++;
                }
            }
            else arr.add(new Teacher(maGV, tenGV, luong));
        }

        for(Teacher person : arr){
            System.out.println(person);
        }
    }
}
