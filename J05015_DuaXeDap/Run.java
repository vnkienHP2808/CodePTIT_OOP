package J05015_DuaXeDap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Candidate> arr = new ArrayList<>();
        int n = Integer.parseInt(ip.nextLine());
        for(int i = 1; i <= n; i++){
            arr.add(new Candidate(ip.nextLine(), ip.nextLine(), ip.nextLine()));
        }
        Collections.sort(arr);
        for(Candidate candidate : arr){
            System.out.println(candidate);
        }
    }
}
