import java.util.HashSet;
import java.util.Scanner;

public class J03009_TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        ip.nextLine();
        while(test-- > 0){
            String[] a1 = ip.nextLine().split("\\s+");
            String[] a2 = ip.nextLine().split("\\s+");
            HashSet<String> set1 = new HashSet<>();
            HashSet<String> set2 = new HashSet<>();
            for(int i = 0; i < a1.length; i++){
                set1.add(a1[i]);
            }
            for(int i = 0; i < a2.length; i++){
                set2.add(a2[i]);
            }
            for(String x : set1) {
                if(!set2.contains(x)) System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

