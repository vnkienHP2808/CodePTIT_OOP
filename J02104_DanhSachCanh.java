import java.util.Scanner;

public class J02104_DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][] arr = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = i+1; j < x; j++) {
                if(arr[i][j] == 1){
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
    }
}
