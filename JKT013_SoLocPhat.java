import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            Queue<String> qe = new LinkedList<>();
            Stack<String> st = new Stack<>();
            qe.add("6");
            qe.add("8");
            int size = 1;
            while(!qe.isEmpty()){
                String s = qe.poll();
                String so1 = s + "6";
                String so2 = s + "8";
                if(so1.length() <= n) qe.add(so1);
                if(so2.length() <= n) qe.add(so2);
                st.push(s);
            }
            System.out.println(st.size());
            while(!st.empty()){
                System.out.print(st.pop() + " ");
            }
            System.out.println();
        }
    }
}
