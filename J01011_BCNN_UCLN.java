import java.util.Scanner;

public class J01011_BCNN_UCLN {
    public static int UCLN(int a, int b){
        while(a * b != 0){
            if(a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }
    public static long BCNN(int a, int b){
        return 1l * a * b / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int a = ip.nextInt(), b = ip.nextInt();
            System.out.println(BCNN(a, b) + " " + UCLN(a, b));
        }
    }
}
