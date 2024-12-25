import java.util.Scanner;

public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String[] str = ip.nextLine().split(" ");
            int cnt1 = 0, cnt2 = 0;
            for(String s : str){
                int x = s.charAt(s.length()-1) - '0';
                if(x % 2 == 0) cnt1++;
                else cnt2++;
            }
            if(cnt2 > cnt1 && str.length % 2 == 1) System.out.println("YES");
            else if(cnt1 > cnt2 && str.length % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
