package J05071_TinhCuocDTCoDinh1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<City> cities = new ArrayList<>();
        ArrayList<Information> information = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            cities.add(new City(ip.nextLine(), ip.nextLine(), Integer.parseInt(ip.nextLine())));
        }
        cities.add(new City("x", "Noi mang", 800));
        int m = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= m; i++){
            String[] a = ip.nextLine().trim().split("\\s+");
            String thueBao = a[0];
            String start = a[1];
            String end = a[2];

            City city = null;
            if(thueBao.charAt(0) == '0'){
                String ma = thueBao.substring(1,3);
                for(City ct : cities){
                    if(ct.getMaVung().equals(ma)){
                        city = ct;
                        break;
                    }
                }
            }
            else city = cities.get(cities.size()-1);

            information.add(new Information(thueBao, start, end, city));
        }

        Collections.sort(information);
        for (Information information1 : information){
            System.out.println(information1);
        }
    }
}
