package J05070_CLBBongDa2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Club> clubs = new ArrayList<>();
        ArrayList<Match> matches = new ArrayList<>();

        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            clubs.add(new Club(ip.nextLine(), ip.nextLine(), Integer.parseInt(ip.nextLine())));
        }
        int m = ip.nextInt();
        for(int i = 1; i <= m; i++){
            String maTD = ip.next();
            int soCDV = ip.nextInt();

            Club club = null;
            for(Club c : clubs){
                if(maTD.substring(1,3).equals(c.getMaCLB())){
                    club = c;
                    break;
                }
            }

            matches.add(new Match(maTD, soCDV, club));
        }
        Collections.sort(matches);
        for(Match match : matches){
            System.out.println(match);
        }
    }
}
