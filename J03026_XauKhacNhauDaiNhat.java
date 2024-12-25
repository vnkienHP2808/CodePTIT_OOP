import java.util.Scanner;

public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            String s1 = ip.next();
            String s2 = ip.next();
            if(s1.equals(s2)) System.out.println(-1);
            else System.out.println(Math.max(s1.length(), s2.length()));
        }
    }
}
