package j05008_DienTichDaGiac;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
                b[i] = ip.nextInt();
            }
            long s = 0;
            for(int i = 0; i < n; i++){
                s += a[i] * b[(i+1) % n];
                s -= a[(i+1)%n] * b[i];
            }
            System.out.printf("%.3f", s*0.5);
            System.out.println();
        }
    }
}
