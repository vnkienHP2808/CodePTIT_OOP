import java.util.Scanner;
import java.util.Stack;

public class JKT015_GoBanPhim {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '<' && c != '>' && c != '-') st1.push(c);
            else{
                if(c == '<'){
                    if(!st1.empty()){
                        st2.push(st1.pop());
                    }
                }
                if(c == '>'){
                    if(!st2.empty()){
                        st1.push(st2.pop());
                    }
                }
                if(c == '-'){
                    if(!st1.empty()){
                        st1.pop();
                    }
                }
            }
        }
        while(!st2.empty()){
            st1.push(st2.pop());
        }
        StringBuilder str = new StringBuilder();
        while(!st1.empty()){
            str.append(st1.pop());
        }
        str = str.reverse();
        System.out.println(str);
    }
}
