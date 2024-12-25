import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Time implements Comparable<Time>{
    private int h;
    private int m;
    private int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public String toString(){
        return this.h + " " + this.m + " " + this.s;
    }

    @Override
    public int compareTo(Time x){
        int time1 = this.h*3600 + this.m*60 + this.s;
        int time2 = x.getH()*3600 + x.getM()*60 + x.getS();
        return time1 - time2;
    }
}

public class J05033_SapXepTime {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Time> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int h = ip.nextInt();
            int m = ip.nextInt();
            int s = ip.nextInt();
            Time time = new Time(h, m, s);
            list.add(time);
        }
        Collections.sort(list);
        for(Time time : list){
            System.out.println(time.toString());
        }
    }
}
