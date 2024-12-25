import java.util.Arrays;
import java.util.Scanner;

public class J02026_DayConCoKPhanTuTangDan {
    public static int n;
    public static int k;
    public static int[] a;
    public static int[] x;
    public static void Try(int i, int pos){
        for(int j = pos; j < n; j++){
            if(a[j] > x[i-1]){
                x[i] = a[j];
                if(i == k){
                    for(int l = 1; l <= k; l++){
                        System.out.print(x[l] + " ");
                    }
                    System.out.println();
                }
                else Try(i+1, j+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            n = ip.nextInt();
            k = ip.nextInt();
            a = new int[n];
            x = new int[n+1];
            x[0] = -1;
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
            }
            Arrays.sort(a);
            Try(1, 0);
        }
    }
}
