import java.util.Scanner;

public class J01004_So_nguyen_to {
    public static boolean ngto(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            if(ngto(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
