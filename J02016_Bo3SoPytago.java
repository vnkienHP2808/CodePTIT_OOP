import java.util.*;

public class J02016_Bo3SoPytago {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                long x = ip.nextLong();
                a[i] = x*x;
            }
            boolean check = true;
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n; j++){
                    if(Arrays.binarySearch(a, a[i] + a[j]) > 0){
                        check = false;
                        System.out.println("YES");
                        break;
                    }
                }
                if(!check) break;
            }
            if(check) System.out.println("NO");
        }
    }
}