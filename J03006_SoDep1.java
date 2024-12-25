import java.util.Scanner;

public class J03006_SoDep1 {

    public static boolean check1(String s){
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') % 2 != 0) return false;
        }
        return true;
    }

    public static boolean check2(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String s = sc.next();
            if(check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

