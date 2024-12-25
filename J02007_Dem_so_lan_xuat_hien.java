import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J02007_Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        for(int t = 1; t <= test; t++){
            int n = ip.nextInt();
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < n; i++){
                int x = ip.nextInt();
                if(map.containsKey(x)){
                    int fre = map.get(x);
                    map.put(x, fre + 1);
                }
                else map.put(x, 1);
            }
            System.out.println("Test " + t + ":");
            Set<Map.Entry<Integer, Integer>> set = map.entrySet();
            for(Map.Entry<Integer, Integer> entry : set){
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}

