import java.util.Scanner;

public class J02021_LietKeToHop2 {
    public static int n;
    public static int k;
    public static int[] a = new int[15];
    public static int cnt = 0;
    public static void Try(int i){
        for(int j = a[i-1] + 1; j <= n; j++){
            a[i] = j;
            if(i == k){
                cnt++;
                for(int l = 1; l <= k; l++) System.out.print(a[l]);
                System.out.print(" ");
            }
            else Try(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        k = ip.nextInt();
        a[0] = 0;
        Try(1);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
