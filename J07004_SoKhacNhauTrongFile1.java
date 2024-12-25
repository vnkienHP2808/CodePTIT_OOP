
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args )throws FileNotFoundException {
        Scanner ip = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(ip.hasNextLine()){
            String[] data = ip.nextLine().trim().split("\\s+");
            for(String s : data){
                int num = Integer.parseInt(s);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for(int x : map.keySet()){
            System.out.println(x + " " + map.get(x));
        }
    }
}
