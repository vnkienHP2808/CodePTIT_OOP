import java.util.Scanner;

public class J01018_So_0_lien_ke {
    public static int sum(String s){
        int Sum = 0;
        for(int i = 0; i < s.length(); i++){
            Sum += (s.charAt(i) - '0');
        }
        return Sum;
    }

    public static boolean check(String s){
        for(int i = 1; i < s.length(); i++){
            int x = s.charAt(i) - '0';
            int y = s.charAt(i - 1) - '0';
            if(Math.abs(x - y) != 2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String s = ip.nextLine();
            if(check(s) && sum(s) % 10 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
