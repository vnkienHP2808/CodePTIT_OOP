import java.util.Scanner;

public class J01021_Tinh_luy_thua {
    public static final int mod = (int)1e9+7;

    public static long cal(long a, long b){
        if(b == 0) return 1;
        long x = cal(a, b / 2);
        if(b % 2 == 0) return (x * x) % mod;
        else return (a * ((x * x) % mod)) % mod;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        while(true){
            long a = ip.nextLong();
            long b = ip.nextLong();
            if(a == 0 && b == 0) break;
            else{
                System.out.println(cal(a, b));
            }
        }
    }
}
