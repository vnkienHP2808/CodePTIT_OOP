import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while(ip.hasNextLine()){
            String[] line = ip.nextLine().toLowerCase().trim().split("\\s+");
            for(String s : line){
                set.add(s);
            }
        }
        for(String s : set){
            System.out.println(s);
        }
    }
}
