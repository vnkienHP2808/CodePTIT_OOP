import java.util.Scanner;

public class J01002_Tinh_tong_N_so_nguyen_dau_tien {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            long n = ip.nextInt();
            System.out.println(1l * n*(n+1)/2);
        }
    }
}
