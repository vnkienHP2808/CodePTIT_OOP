package J04003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        long tu = ip.nextLong();
        long mau = ip.nextLong();
        PhanSo ps = new PhanSo(tu, mau);
        PhanSo rutgon = ps.Solve();
        System.out.println(rutgon.toString());
    }
}
