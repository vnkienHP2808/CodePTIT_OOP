import java.util.HashMap;
import java.util.Scanner;

public class J08015_CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            int n = ip.nextInt();
            long k = ip.nextLong();
            HashMap<Long, Integer> map = new HashMap<>();
            for(int i = 1; i <= n; i++){
                long x = ip.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            long total = 0;
            for(long x : map.keySet()){
                long value = k - x;
                if(map.containsKey(value)){
                    if(x != value) total += (long) map.get(value) * map.get(x);
                    else total += (long) map.get(value) * (map.get(value)-1);
                }
            }
            System.out.println(total / 2);
        }
    }
}
