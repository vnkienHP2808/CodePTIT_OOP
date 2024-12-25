import java.math.BigInteger;
import java.util.Scanner;

public class J03014_TongSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        BigInteger so1 = new BigInteger(ip.next());
        BigInteger so2 = new BigInteger(ip.next());
        System.out.println(so1.add(so2));
    }
}
