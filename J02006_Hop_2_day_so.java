import java.util.Scanner;

public class J02006_Hop_2_day_so {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        int[] arr = new int[1005];
        for(int i = 0; i < n + m; i++){
            int x = ip.nextInt();
            arr[x] = 1;
        }
        for(int i = 0; i < 1005; i++){
            if(arr[i] == 1) System.out.print(i + " ");
        }
    }
}
