import java.util.Scanner;
import java.util.Stack;

public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
            }
            for(int i = 0; i < n; i++){
                if(st.empty()) st.push(i);
                else{
                    while(!st.empty() && a[i] > a[st.peek()]){
                        b[st.pop()] = i;
                    }
                    st.push(i);
                }
            }
            while(!st.empty()){
                b[st.pop()] = -1;
            }
            for(int i = 0; i < n; i++){
                if(b[i] != -1) System.out.print(a[b[i]] + " ");
                else System.out.print(-1 + " ");
            }
            System.out.println();
        }
    }
}
