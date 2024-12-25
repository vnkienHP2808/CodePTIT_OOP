import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03010_DiaChiEmail {


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String[] s = ip.nextLine().trim().toLowerCase().split("\\s+");
            int n = s.length;
            String tmp = s[n-1];
            for(int i = 0; i < n-1; i++){
                tmp += s[i].charAt(0);
            }
            list.add(tmp);
            int cnt = Collections.frequency(list, tmp);// collections dùng cho ArrayList
            if(cnt != 1) tmp += cnt;
            tmp += "@ptit.edu.vn";
            System.out.println(tmp);
        }
    }
}

