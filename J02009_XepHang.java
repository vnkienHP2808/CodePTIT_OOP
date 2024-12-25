import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class J02009_XepHang {
    public static class Pair{
        int t;
        int d;
        public Pair(int t, int d){
            this.t = t;
            this.d = d;
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
       Vector<Pair> list = new Vector<>();
        for(int i = 0; i < n; i++){
            int t = ip.nextInt();
            int d = ip.nextInt();
            Pair p = new Pair(t, d);
            list.add(p);
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.t > o2.t) return 1;
                else return -1;
            }
        });
        int time = 0;
        for(int i = 0; i < n; i++){
            if(time < list.get(i).t){
                time = list.get(i).t;
            }
            time += list.get(i).d;
        }
        System.out.println(time);
    }
}
