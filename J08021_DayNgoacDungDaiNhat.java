import java.util.Scanner;
import java.util.Stack;

public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            String s = ip.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int size = 0;
            char x = ')';
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(') {
                    st.push(i);
                    x = '(';
                }
                else{
                    if(st.size() == 1 && x == ')'){
                        st.pop();
                        st.push(i);
                    }
                    else{
                        st.pop();
                        size = Math.max(size, i - st.peek());
                        x = ')';
                    }
                }
            }
            System.out.println(size);
        }
    }
}
