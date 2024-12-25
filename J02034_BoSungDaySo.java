import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[205];
        int max = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            dx[x] = 1;
            if(x > max) max = x;
        }
        boolean ex = true;
        for(int i = 1; i <= max; i++){
            if(dx[i] == 0) {
                System.out.println(i);
                ex = false;
            }
        }
        if(ex) System.out.println("Excellent!");
    }
}
