package J07038_DanhSachThucTap3;

import java.io.*;
import java.util.*;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner svScanner = new Scanner(new File("SINHVIEN.in"));
        Scanner dnScanner = new Scanner(new File("DN.in"));
        Scanner ttScanner = new Scanner(new File("THUCTAP.in"));

        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        int soSV = Integer.parseInt(svScanner.nextLine());
        for (int i = 0; i < soSV; i++) {
            sinhViens.add(new SinhVien(svScanner.nextLine(), svScanner.nextLine(), svScanner.nextLine(), svScanner.nextLine()));
        }
        Collections.sort(sinhViens);

        Map<String, DoanhNghiep> doanhNghieps = new HashMap<>();
        int soDN = Integer.parseInt(dnScanner.nextLine());
        for (int i = 0; i < soDN; i++) {
            DoanhNghiep dn = new DoanhNghiep(dnScanner.nextLine(), dnScanner.nextLine(), Integer.parseInt(dnScanner.nextLine()));
            doanhNghieps.put(dn.getMaDN(), dn);
        }

        int soTT = Integer.parseInt(ttScanner.nextLine());
        for (int i = 0; i < soTT; i++) {
            String maSV = ttScanner.next();
            String maDN = ttScanner.next();
            DoanhNghiep dn = doanhNghieps.get(maDN);
            if (dn != null) {
                for (SinhVien sv : sinhViens) {
                    if (sv.getMaSV().equals(maSV)) {
                        dn.addSinhVien(sv);
                        break;
                    }
                }
            }
        }

        int soDNCanIn = Integer.parseInt(ttScanner.nextLine());
        for (int i = 0; i < soDNCanIn; i++) {
            String maDN = ttScanner.nextLine();
            DoanhNghiep dn = doanhNghieps.get(maDN);
            if (dn != null) {
                dn.sortSinhVien();  // Sắp xếp sinh viên theo mã
                System.out.println(dn);
            }
        }
    }
}
