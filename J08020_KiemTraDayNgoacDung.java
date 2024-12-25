import java.util.Scanner;
import java.util.Stack;

public class J08020_KiemTraDayNgoacDung {
    public static boolean check(char c, char d){
        if(c == '(' && d == ')') return true;
        if(c == '{' && d == '}') return true;
        if(c == '[' && d == ']') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            String s = ip.next();
            Stack<Character> st = new Stack<>();
            boolean ktra = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') st.push(s.charAt(i));
                else {
                    if(!st.empty()){
                        ktra = check(st.pop(), s.charAt(i));
                        if(!ktra) break;
                    }
                    else ktra = false;
                }
            }
            if(ktra) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

