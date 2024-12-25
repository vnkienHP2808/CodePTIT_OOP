import java.util.Arrays;
import java.util.Scanner;

public class J02027_KhoangCachNhoHonK {
    public static int lowerBound(int[] a, int l, int r, int key){
        int pos = -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(a[mid] < key){
                l = mid + 1;
                pos = mid;
            }
            else{
                r = mid - 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            int k = ip.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
            }
            Arrays.sort(a);
            long cnt = 0;
            for(int i = 0; i < n; i++){
                int idx = lowerBound(a, 0, n-1, k+a[i]);
                if(idx != -1) cnt += idx - i;
            }
            System.out.println(cnt);
        }
    }
}
