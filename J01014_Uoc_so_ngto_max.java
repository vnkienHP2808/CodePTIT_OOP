import java.util.Scanner;

public class J01014_Uoc_so_ngto_max {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            long n = ip.nextLong();
            long pos = 0;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    pos = i;
                    while(n % i == 0){
                        n /= i;
                    }
                }
            }
            if(n != 1) pos = n;
            System.out.println(pos);
        }
    }
}
