import java.util.Arrays;
import java.util.Scanner;

public class J01007_Kiem_tra_so_Fibo {
    public static void main(String[] args) {
        long[] fibo = new long[93];
        fibo[0] = 1; fibo[1] = 1;
        for(int i = 2; i < 93; i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            long n = ip.nextLong();
            if(n == 0) System.out.println("YES");
            else{
                if(Arrays.binarySearch(fibo, n) >= 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
