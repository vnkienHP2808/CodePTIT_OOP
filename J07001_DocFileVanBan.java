import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("DATA.in"));
        while(ip.hasNextLine()){
            System.out.println(ip.nextLine());
        }
    }
}
