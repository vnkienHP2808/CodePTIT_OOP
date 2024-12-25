import java.util.Scanner;

public class J02023_LuaChonThamLam {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int s = ip.nextInt();
        if(n*9 < s || s == 0) System.out.println("-1 -1");
        else{
            int s1 = s;
            int[] big = new int[n];
            int[] small = new int[n];
            for(int i = 0; i < n; i++){
                if(s >= 9){
                    big[i] = 9;
                    s -= 9;
                }
                else{
                    big[i] = s;
                    s = 0;
                }
            }
            s1--;
            for(int i = n-1; i >= 1; i--){
                if(s1 >= 9){
                    small[i] = 9;
                    s1 -= 9;
                }
                else{
                    small[i] = s1;
                    s1 = 0;
                }
            }
            s1++;
            small[0] = s1;
            for(int i : small) System.out.print(i);
            System.out.print(" ");
            for(int i : big) System.out.print(i);
        }
    }
}
