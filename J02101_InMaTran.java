import java.util.Scanner;

public class J02101_InMaTran {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int  n = ip.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = ip.nextInt();
                }
            }
            int h1 = 0;
            while(h1 < n){
                if(h1 % 2 == 0){
                    for(int i = 0; i < n; i++){
                        System.out.print(arr[h1][i] + " ");
                    }
                }
                else{
                    for(int i = n - 1; i >= 0; i--){
                        System.out.print(arr[h1][i] + " ");
                    }
                }
                h1++;
            }
            System.out.println();
        }
    }
}
