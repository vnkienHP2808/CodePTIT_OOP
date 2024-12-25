import java.util.Scanner;

public class J03007_SoDep2 {
    public static boolean check1(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static int sum(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += (s.charAt(i) - '0');
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            String s = ip.next();
            if(s.charAt(0) == '8' && s.charAt(s.length() -1) == '8' && sum(s) % 10 == 0 && check1(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

