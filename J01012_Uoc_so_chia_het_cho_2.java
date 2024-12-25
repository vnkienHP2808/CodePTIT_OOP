import java.util.Scanner;

public class J01012_Uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            if(n % 2 == 1) System.out.println(0);
            else{
                int cnt = 0;
                for (int i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if (i % 2 == 0) {
                            cnt++;
                        }
                        if ((n / i) % 2 == 0 && i != Math.sqrt(n)) {
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
