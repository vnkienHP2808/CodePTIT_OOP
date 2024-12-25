import java.util.Scanner;

public class J01013_Tong_uoc_so1 {
    public static final int N = 2 * 1000000;
    public static int[] prime = new int[N + 2];

    public static void sangSoNguyenTo(){
        for(int i = 2; i <= Math.sqrt(N); i++){
            if(prime[i] == 0){
                for(int j = i * i; j <= N; j += i){
                    if(prime[j] == 0){
                        prime[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i <= N; i++){
            if(prime[i] == 0){
                prime[i] = i;
            }
        }
    }

    public static int tinhTong(int n){
        if(prime[n] == 0){
            return n;
        }
        int sum = 0;
        while(n != 1){
            sum += prime[n];
            n /= prime[n];
        }
        return sum;
    }

    public static void main(String[] args){
        sangSoNguyenTo();
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        long sum = 0;
        while(test-- > 0){
            int n = ip.nextInt();
            sum += tinhTong(n);
        }
        System.out.println(sum);
    }
}
