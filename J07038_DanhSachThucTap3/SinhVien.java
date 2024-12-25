package J07038_DanhSachThucTap3;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, tenSV, lopSV, email;

    public SinhVien(String maSV, String tenSV, String lopSV, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String dangChuanHoTen() {
        String[] s = tenSV.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : s) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }

    @Override
    public int compareTo(SinhVien other) {
        return this.maSV.compareTo(other.maSV);
    }

    @Override
    public String toString() {
        return maSV + " " + dangChuanHoTen() + " " + lopSV;
    }
}
