import java.util.Scanner;

public class J01026_So_chinh_phuong {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0) {
            int n = ip.nextInt();
            int x = (int)Math.sqrt(n);
            if(x * x == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
