package J05054_XepHangHocSinh;

import java.text.DecimalFormat;

public class Student {
    private int stt;
    private String maSV, hoTen;
    private double diemTB;

    public Student(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public String phanLoai(){
        if(diemTB < 5.0) return "Yeu";
        if(diemTB < 7.0) return "Trung Binh";
        if(diemTB < 9.0) return "Kha";
        return "Gioi";
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat(".0");
        return maSV + " " + hoTen + " " +  df.format(diemTB)+ " " + phanLoai() + " " + stt;
    }
}
