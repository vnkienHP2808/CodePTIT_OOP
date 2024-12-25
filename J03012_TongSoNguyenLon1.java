import java.math.BigInteger;
import java.util.Scanner;

public class J03012_TongSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            BigInteger so1 = new BigInteger(ip.next());
            BigInteger so2 = new BigInteger(ip.next());
            System.out.println(so1.add(so2));
        }
    }
}
