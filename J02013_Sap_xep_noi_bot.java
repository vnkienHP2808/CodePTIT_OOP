import java.util.Scanner;

public class J02013_Sap_xep_noi_bot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            boolean check = true;
            
            for(int j = 0; j < n - 1; j++){
                if(arr[j] > arr[j+1]){
                    check = false;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if(check) break;
            else{
                System.out.print("Buoc " + (i+1) + ": ");
                for(int j = 0; j < n; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
