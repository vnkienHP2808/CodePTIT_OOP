package J05080_LopHocPhan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<InforClass> info = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            info.add(new InforClass(ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }

        int q = Integer.parseInt(ip.nextLine());
        while(q-- > 0){
            String input = ip.nextLine();
            System.out.println("Danh sach cho giang vien " + input + ":");

            Collections.sort(info);

            for (InforClass ifor : info) {
                if (ifor.getTenGV().equals(input)) System.out.println(ifor);
            }
        }
    }
}
