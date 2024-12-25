import java.util.Scanner;

public class J02011_Sap_xep_chon {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int x = arr[i];
            int pos = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < x){
                    x = arr[j];
                    pos = j;
                }
            }
            int tmp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = tmp;
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k = 0; k < n; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
