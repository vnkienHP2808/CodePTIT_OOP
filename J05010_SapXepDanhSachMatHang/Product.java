package J05010_SapXepDanhSachMatHang;

import java.text.DecimalFormat;

public class Product {
    private int maSanPham;
    private String tenSanPham;
    private String loaiSanPham;
    private double giaMua;
    private double giaBan;
    private double loiNhuan;

    public Product(int maSanPham, String tenSanPham, String loaiSanPham, double giaMua, double giaBan) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public  String toString(){
        DecimalFormat df = new DecimalFormat(".00");
        return maSanPham + " " + tenSanPham + " " + loaiSanPham + " " + df.format(loiNhuan);
    }
}
