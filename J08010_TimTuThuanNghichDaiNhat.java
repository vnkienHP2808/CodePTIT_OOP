import java.util.LinkedHashMap;
import java.util.Scanner;

public class J08010_TimTuThuanNghichDaiNhat {
    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while(ip.hasNextLine()){
            String[] a = ip.nextLine().trim().split("\\s+");
            for(String s : a){
                if(check(s)){
                    map.put(s, map.getOrDefault(s, 0) + 1);
                }
            }
        }
        int M = 0;
        for(String s : map.keySet()){
            M = Math.max(M, s.length());
        }
        for(String s : map.keySet()){
           if(s.length() == M) System.out.println(s + " " + map.get(s));
        }
    }
}
