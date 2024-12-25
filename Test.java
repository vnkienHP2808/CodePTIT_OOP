import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            int num = ip.nextInt();
            arr.add(num);
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return hmap.get(o2) - hmap.get(o1);
            }
        });

        for(int x : arr){
            if(hmap.get(x) != 0){
                System.out.print(x + " ");
                hmap.put(x, hmap.get(x) - 1);
            }
        }
        System.out.println("");
    }
}
