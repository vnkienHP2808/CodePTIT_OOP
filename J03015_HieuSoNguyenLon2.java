import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        BigInteger n = new BigInteger(ip.next());
        BigInteger m = new BigInteger(ip.next());
        BigInteger sub = n.subtract(m);
        System.out.println(sub);
    }
}
