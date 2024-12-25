import java.util.Scanner;

public class J02020_LietKeToHop {
    public static int[] arr = new int[15];
    static int cnt = 0;

    public static void output(int k){
        for(int i = 1; i <= k; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void solve(int i, int n, int k){
        for(int j = arr[i-1] + 1; j <= n; j++){
            arr[i] = j;
            if(i == k){
                output(k);
                cnt++;
            }
            else solve(i+1, n, k);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        arr[0] = 0;
        solve(1, n, k);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
