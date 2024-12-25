import java.util.Scanner;

public class J01017_So_lien_ke {
    public static boolean check(String s){
        for(int i = 1; i < s.length(); i++){
            int x = s.charAt(i) - '0';
            int y = s.charAt(i - 1) - '0';
            if(Math.abs(x - y) != 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String s = ip.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
