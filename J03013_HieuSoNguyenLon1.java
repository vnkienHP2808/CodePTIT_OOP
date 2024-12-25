import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            BigInteger n = new BigInteger(ip.next());
            BigInteger m = new BigInteger(ip.next());
            BigInteger sub = n.subtract(m);
            sub = sub.abs();
            String sub1 = sub.toString();
            int n1 = n.toString().length();
            int n2 = m.toString().length();
            int n3 = sub1.length();
            for(int i = 1; i <= Math.max(n1, n2) - n3; i++){
                sub1 = "0" + sub1;
            }
            System.out.println(sub1);
        }
    }
}
