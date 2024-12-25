package J05036_TinhGiaBan1;

public class Product {
    private String maSP, tenSP, donViTinh;
    private int donGiaNhap, soLuong, phiVanChuyen, thanhTien, giaBan;

    public Product(String maSP, String tenSP, String donViTinh, int donGiaNhap, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;

        this.phiVanChuyen = Math.round(this.donGiaNhap*this.soLuong*0.05f);
        this.thanhTien = this.donGiaNhap * this.soLuong + this.phiVanChuyen;
        this.giaBan =  Math.round(this.thanhTien * 1.02f);
    }

    public String toString(){
        return maSP + " " + tenSP + " " + donViTinh + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }
}
