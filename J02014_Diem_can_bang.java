import java.util.Scanner;

public class J02014_Diem_can_bang {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            int[] arr = new int[n];
            int[] sum = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = ip.nextInt();
                if(i == 0) sum[i] = arr[i];
                else sum[i] = arr[i] + sum[i-1];
            }
            boolean check = true;
            for(int i = 1; i < n-1; i++){
                int sum1 = sum[i-1];
                int sum2 = sum[n-1] - sum[i+1] + arr[i+1];
                if(sum1 == sum2){
                    check = false;
                    System.out.println(i+1);
                    break;
                }
            }
            if(check) System.out.println(-1);
        }
    }
}
