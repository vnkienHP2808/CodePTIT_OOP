import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02017_Thu_gon_day_so {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(ip.nextInt());
        }
        while(true){
            boolean stop = true;
            for(int i = 0; i < list.size() - 1; i++){
                if((list.get(i) + list.get(i + 1)) % 2 == 0){
                    list.remove(i+1);
                    list.remove(i);
                    i--;
                    stop = false;
                }
            }
            if(stop){
                System.out.println(list.size());
                break;
            }
        }

    }
}
