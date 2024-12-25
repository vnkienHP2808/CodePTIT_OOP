package J05045_SapXepNhanVienTheoThuNhap;

public class Employee {
    private String maNV, tenNV, chucVu;
    private int luongCoBan, soNgayCong;

    public Employee(String maNV, String tenNV, String chucVu, int luongCoBan, int soNgayCong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public int phuCap(){
        if(chucVu.equals("GD")) return 500;
        if(chucVu.equals("PGD")) return 400;
        if(chucVu.equals("TP")) return 300;
        if(chucVu.equals("KT")) return 250;
        return 100;
    }

    public int Luong(){
        return soNgayCong*luongCoBan;
    }

    public int compareTo(Employee person2){
        return this.maNV.compareTo(person2.maNV);
    }

    public int tamUng(){
        if(1.0*(phuCap() + Luong())*2.0/3 < 25000.0)
            return (int)Math.round((phuCap() + Luong())*2.0/3000)*1000;
        return 25000;
    }

    public int conLai(){
        return Luong() + phuCap() - tamUng();
    }

    public String toString(){
        return maNV + " " + tenNV + " " + phuCap() + " " + Luong() + " " + tamUng() + " " + conLai();
    }
}
