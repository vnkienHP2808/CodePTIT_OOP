import java.util.Scanner;

public class J01022_Xau_nhi_phan {
    public static long fibo[] = new long[93];
    public static void setUp(){
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i < 93; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }

    public static int find(int n, long k){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(k <= fibo[n-2]) return find(n - 2, k);
        else return find(n-1, k - fibo[n-2]);
    }

    public static void main(String[] args) {
        setUp();
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            long k = ip.nextLong();
            System.out.println(find(n, k));
        }
    }
}
