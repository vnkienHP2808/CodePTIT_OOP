import java.util.Scanner;

public class J02008_Boi_so_min_cua_N_so_dau {
    public static long ucln(long  a, long b){
        while(b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    public static long bcnn(long a, long b){
        return a * b / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            long n = ip.nextInt();
            long res = 1;
            for(long i = 2; i <= n; i++){
                res = bcnn(res, i);
            }
            System.out.println(res);
        }
    }
}
