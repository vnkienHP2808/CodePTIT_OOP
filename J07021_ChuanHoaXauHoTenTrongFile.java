import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static String change(String[] line){
        String tmp = "";
        for(String str : line){
            tmp += str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }
        return tmp;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("DATA.in"));
        String line;
        while(!(line = ip.nextLine()).equals("END")){
            String[] data =  line.trim().split("\\s+");
            System.out.println(change(data));
        }
    }
}
