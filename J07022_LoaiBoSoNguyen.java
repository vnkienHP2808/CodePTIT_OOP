import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(ip.hasNext()){
            String s = ip.next();
            try{
                int n = Integer.parseInt(s);
            }
            catch (NumberFormatException e){
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
