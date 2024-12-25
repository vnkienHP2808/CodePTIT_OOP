import java.util.Scanner;

public class J01009_Tong_giai_thua {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        long tich = 1;
        long sum = 0;
        for(int i = 1; i <= n; i++){
            tich *= i;
            sum += tich;
        }
        System.out.println(sum);
    }
}
