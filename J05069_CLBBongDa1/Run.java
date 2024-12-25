package J05069_CLBBongDa1;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Club> arr = new ArrayList<>();
        ArrayList<Match> list = new ArrayList<>();
        int n = ip.nextInt();
        for(int i = 1; i <= n; i++){
            ip.nextLine();
            arr.add(new Club(ip.nextLine(), ip.nextLine(), ip.nextInt()));
        }
        int m = ip.nextInt();
        for(int i = 1; i <= m; i++){
            String maTD = ip.next();
            int soCDV = ip.nextInt();
            Club club = null;
            for(Club c : arr){
                if(maTD.substring(1,3).equals(c.getMaCLB())){
                    club = c;
                    break;
                }
            }
            list.add(new Match(maTD, soCDV, club));
        }

        for(Match match : list){
            System.out.println(match);
        }
    }
}
