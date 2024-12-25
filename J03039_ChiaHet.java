import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0) {
            BigInteger n = new BigInteger(ip.next());
            BigInteger m = new BigInteger(ip.next());
            BigInteger d = n.mod(m);
            BigInteger e = m.mod(n);
            if(d.toString().equals("0") || e.toString().equals("0")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
