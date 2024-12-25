import java.util.Scanner;

public class J01006_Tinh_so_Fibo {
    public static void main(String[] args) {
        long[] fibo = new long[93];
        fibo[0] = 1; fibo[1] = 1;
        for(int i = 2; i < 93; i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            System.out.println(fibo[n-1]);
        }
    }
}
