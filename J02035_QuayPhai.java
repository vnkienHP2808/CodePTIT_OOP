import java.util.List;
import java.util.Scanner;

public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
            }
            int k = 0;
            for(int i = 0; i < n-1; i++){
                if(a[i] > a[i+1]){
                    k++;
                    break;
                }
                k++;
            }
            if(k == n-1) System.out.println(0);
            else System.out.println(k);
        }
    }
}
