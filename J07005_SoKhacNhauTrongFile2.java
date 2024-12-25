import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dtf = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < 100000; i++){
            int num = dtf.readInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int first : map.keySet()){
            System.out.println(first + " " + map.get(first));
        }
    }
}
