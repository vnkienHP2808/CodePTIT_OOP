package J06003_QuanLyBaiTapNhom1;

public class Student {
    private String maSV, tenSV, sdt;
    private int nhom;

    public Student(String maSV, String tenSV, String sdt, int nhom) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getNhom() {
        return nhom;
    }

    @Override
    public String toString(){
        return maSV + " " + tenSV + " " + sdt;
    }
}
