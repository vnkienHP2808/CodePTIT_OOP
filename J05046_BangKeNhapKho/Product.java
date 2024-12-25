package J05046_BangKeNhapKho;

public class Product {
    private String maSP, tenSP;
    private int soLuong, donGia;

    public Product(String maSP, String tenSP, int soLuong, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int chietKhau(){
        if(soLuong > 10) return 5;
        if(soLuong >= 8 && soLuong <= 10) return 2;
        if(soLuong >= 5 && soLuong < 8) return 1;
        return 0;
    }

    public int tienHang(){
        return soLuong * donGia;
    }

    public int tienChietKhau(){
        return tienHang()*chietKhau()/100;
    }

    public String toString(){
        return maSP + " " + tenSP + " " + tienChietKhau() + " " + (tienHang() - tienChietKhau());
    }
}
