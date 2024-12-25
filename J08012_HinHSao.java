import java.util.HashMap;
import java.util.Scanner;

public class J08012_HinHSao {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n-1; i++){
            int x = ip.nextInt();
            int y = ip.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
            map.put(y, map.getOrDefault(y, 0 ) + 1);
        }
        boolean check = true;
        for(int i = 1; i <= n; i++){
            if(map.containsKey(i) && map.get(i) != n-1 && map.get(i) != 1){
                check = false;
                break;
            }
        }
        if(check) System.out.println("Yes");
        else System.out.println("No");
    }
}
