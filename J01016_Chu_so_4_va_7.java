import java.util.Scanner;

public class J01016_Chu_so_4_va_7 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        int scs = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '4' || c == '7') scs++;
        }
        if(scs != 4 && scs != 7) System.out.println("NO");
        else System.out.println("YES");
    }
}
