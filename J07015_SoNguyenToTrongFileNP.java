import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class J07015_SoNguyenToTrongFileNP {

    public static int[] prime = new int[10000];

    public static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 100; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < 10000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
        FileInputStream f = new FileInputStream("SONGUYEN.in");
        ObjectInputStream os = new ObjectInputStream(f);
        ArrayList<Integer> arr = (ArrayList<Integer>) os.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int num : arr){
            if(prime[num] == 1) map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int first : map.keySet()){
            System.out.println(first + " " + map.get(first));
        }
    }
}
