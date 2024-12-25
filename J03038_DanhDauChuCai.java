import java.util.HashSet;
import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        System.out.println(set.size());
    }
}
