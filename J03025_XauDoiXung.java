import java.util.Scanner;

public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            String s = ip.next();
            int cnt = 0;
            int l = 0, r = s.length() - 1;
            while(l < r){
                if(s.charAt(l) != s.charAt(r)) cnt++;
                l++;
                r--;
            }
            //size chẵn thì không nói, còn size lẻ thì trường hợp đổi cái ở giữa
            if((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 == 1 && cnt <= 1)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
