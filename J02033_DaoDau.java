import java.util.Arrays;
import java.util.Scanner;

public class J02033_DaoDau {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        long[] a = new long[n];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            a[i] = ip.nextLong();
            if(a[i] < 0) cnt++;
        }
        Arrays.sort(a);
        if(k <= cnt){
            for(int i = 0; i < k; i++){
                a[i] = -a[i];
            }
        }
        else{
            for(int i = 0; i < cnt; i++){
                a[i] = -a[i];
            }
            k -= cnt;
            Arrays.sort(a);
            if(k % 2 == 1) a[0] = -a[0];
        }
        long sum = 0;
        for(long i : a) sum += i;
        System.out.println(sum);
    }
}
