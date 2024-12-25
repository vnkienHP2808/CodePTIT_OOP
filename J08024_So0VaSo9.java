import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            Queue<String> st = new LinkedList<>();
            st.add("9");
            int n = ip.nextInt();
            while(true){
                String s = st.poll();
                if(Long.parseLong(s) % n == 0){
                    System.out.println(Long.parseLong(s));
                    break;
                }
                st.add(s + "0");
                st.add(s + "9");
            }
        }
    }
}
