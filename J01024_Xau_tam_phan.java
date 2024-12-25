import java.util.Scanner;

public class J01024_Xau_tam_phan {
    public static boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '0' && c != '1' && c != '2'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String s = ip.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
