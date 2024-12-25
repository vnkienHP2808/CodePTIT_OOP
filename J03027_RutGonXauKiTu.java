import java.util.ArrayList;
import java.util.Scanner;

public class J03027_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        while(true){
            boolean stop = true;
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i) == list.get(i+1)){
                    stop = false;
                    list.remove(i+1);
                    list.remove(i);
                }
            }
            if(stop) break;
        }
        if(list.isEmpty()) System.out.println("Empty String");
        else{
            for(char c : list) System.out.print(c);
            System.out.println();
        }
    }
}
