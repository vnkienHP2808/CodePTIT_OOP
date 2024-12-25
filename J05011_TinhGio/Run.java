package J05011_TinhGio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Player> list = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++){
            list.add(new Player(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return (o2.timeOut() - o2.timeIn()) - (o1.timeOut() - o1.timeIn());
            }
        });
        for(Player player : list){
            System.out.println(player.toString());
        }
    }
}
