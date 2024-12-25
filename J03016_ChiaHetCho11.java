import java.util.Scanner;

public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            String s = ip.next();
            int odd = 0, even = 0;
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0) even += s.charAt(i) - '0';
                else odd += s.charAt(i) - '0';
            }
            if(Math.abs(odd - even) % 11 == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}

