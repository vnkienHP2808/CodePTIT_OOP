package J05019_LuongMuaTB;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Information> arr = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Information(String.format("T%02d", i), ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextInt()));
        }
        
    }
}
