import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07029_SoNguyenToLonNhatTrongFile {
    public static boolean ngto(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return  true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) os.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int num : arr){
            if (ngto(num)) map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < 10; i++){
            int num = map.lastKey();
            System.out.println(num + " " + map.get(num));
            map.remove(num);
        }
    }
}
