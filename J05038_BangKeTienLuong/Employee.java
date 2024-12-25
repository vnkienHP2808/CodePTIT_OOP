package J05038_BangKeTienLuong;

public class Employee {
    private String maNV, hoTen, chucVu;
    private int luongNgay, soNgayCong;

    public Employee(String maVN, String hoTen, int luongNgay, int soNgayCong, String chucVu) {
        this.maNV = maVN;
        this.hoTen = hoTen;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public int luongThang(){
        return luongNgay * soNgayCong;
    }

    public int thuong(){
        if(soNgayCong >= 25) return luongThang() * 20 / 100;
        if(soNgayCong >= 22 && soNgayCong < 25) return luongThang() * 10 / 100;
        return 0;
    }

    public int phuCapChucVu(){
        if(chucVu.equals("GD")) return 250000;
        if(chucVu.equals("PGD")) return 200000;
        if(chucVu.equals("TP")) return 180000;
        return 150000;
    }

    public int thucLinh(){
        return luongThang() + phuCapChucVu() + thuong();
    }

    public String toString(){
        return maNV + " " + hoTen + " " + luongThang() + " " + thuong() + " " + phuCapChucVu() + " " + thucLinh();
    }
}
