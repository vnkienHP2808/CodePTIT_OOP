import java.util.Arrays;
import java.util.Scanner;

public class J02012_Sap_xep_chen {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print("Buoc " + i + ": ");
            Arrays.sort(arr, 0, i+1 );
            for(int j = 0; j <= i; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
