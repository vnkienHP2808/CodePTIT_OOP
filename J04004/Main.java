package J04004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        long tu1 = ip.nextLong();
        long mau1 = ip.nextLong();
        long tu2 = ip.nextLong();
        long mau2 = ip.nextLong();
        PhanSo ps1 = new PhanSo(tu1, mau1).RutGon();
        PhanSo ps2 = new PhanSo(tu2, mau2).RutGon();
        System.out.println(ps1.Calculator(ps2).toString());
    }
}
