import java.util.Arrays;
import java.util.Scanner;

public class J02102_MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] a = new int[n*n];
        int[][] b = new int[n][n];
        for(int i = 0; i < n*n; i++){
            a[i] = ip.nextInt();
        }
        Arrays.sort(a);
        int h1 = 0, h2 = n-1;
        int c1 = 0, c2 = n-1;
        int i = 0;
        while(h1 <= h2 && c1 <= c2){
            for(int j = c1; j <= c2; j++){
                b[h1][j] = a[i];
                i++;
            }
            h1++;
            for(int j = h1; j <= h2; j++){
                b[j][c2] = a[i];
                i++;
            }
            c2--;
            if(c1 <= c2){
                for(int j = c2; j >= c1; j--){
                    b[h2][j] = a[i];
                    i++;
                }
                h2--;
            }
            if(h1 <= h2){
                for(int j = h2; j >= h1; j--){
                    b[j][c1] = a[i];
                    i++;
                }
                c1++;
            }
        }
        for(i = 0; i < n; i++){
            for(int j = 0; j < n; j++) System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}
