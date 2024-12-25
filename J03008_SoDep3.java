import java.util.Scanner;

public class J03008_SoDep3 {
    public static boolean check2(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static boolean check1(String s){
        for(char c : s.toCharArray()){
            if(c != '2' && c != '3' && c != '5' && c != '7') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            String s = ip.next();
            if(check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
