import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class Bai1_ThucHanh3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("DATA.in"));
        BigInteger sum = new BigInteger("0");
        while(ip.hasNext()){
            String s = ip.next();
            try{
                long n = Long.parseLong(s);
                if(n > Integer.MAX_VALUE) sum = sum.add(new BigInteger(n+""));
            }
            catch (NumberFormatException e){

            }
        }
        System.out.println(sum);
    }
}
