import java.util.Arrays;
import java.util.Scanner;

public class J02005_Giao_2_day_so {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[1005];
        for(int i = 0; i < n; i++){
            a[i] = ip.nextInt();
            c[a[i]] = 1;
        }
        for(int i = 0; i < m; i++){
            b[i] = ip.nextInt();
        }
        Arrays.sort(b);
        for(int i : b){
            if(c[i] == 1){
                System.out.print(i + " ");
                c[i] = 2;
            }
        }
    }
}
