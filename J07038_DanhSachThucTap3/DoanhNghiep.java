package J07038_DanhSachThucTap3;

import java.util.ArrayList;
import java.util.Collections;

public class DoanhNghiep {
    private String maDN, tenDN;
    private int soSV;
    private ArrayList<SinhVien> danhSachSV = new ArrayList<>();

    public DoanhNghiep(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    public String getMaDN() {
        return maDN;
    }

    public int getSoSV() {
        return soSV;
    }

    public void addSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
    }

    public void sortSinhVien() {
        Collections.sort(danhSachSV);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DANH SACH THUC TAP TAI ").append(tenDN).append(":\n");
        int limit = Math.min(soSV, danhSachSV.size());
        for (int i = 0; i < limit; i++) {
            sb.append(danhSachSV.get(i)).append("\n");
        }
        return sb.toString().trim();
    }
}
