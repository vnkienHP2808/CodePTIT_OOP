import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UclnCua2SoNguyenLon {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            BigInteger n = new BigInteger(ip.next());
            BigInteger m = new BigInteger(ip.next());
            System.out.println(n.gcd(m));
        }
    }
}
