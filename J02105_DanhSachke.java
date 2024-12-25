import java.util.Scanner;

public class J02105_DanhSachke {
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
            System.out.print("List(" + (i+1) + ") = ");
            for (int j = 0; j < x; j++) {
                if(arr[i][j] == 1){
                    System.out.print((j+1) + " ");
                }
            }
            System.out.println();
        }
    }
}
