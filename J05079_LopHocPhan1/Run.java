package J05079_LopHocPhan1;

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

        int q = ip.nextInt();
        while(q-- > 0){
            String input = ip.next();
            for(InforClass ifor : info){
                if(input.equals(ifor.getMaMH())){
                    System.out.println("Danh sach nhom lop mon " + ifor.getTenMH() + ":");
                    break;
                }
            }

            Collections.sort(info);

            for (InforClass ifor : info) {
                if (ifor.getMaMH().equals(input)) System.out.println(ifor);
            }
        }
    }
}
