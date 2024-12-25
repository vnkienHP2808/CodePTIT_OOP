package J05012_TinhTien;

public class Product implements Comparable<Product>{
    private String maMH, tenMH;
    private long soLuong, donGia, chietKhau;

    public Product(String maMH, String tenMH, long soLuong, long donGia, long chietKhau) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public long thanhTien(){
        return soLuong*donGia - chietKhau;
    }

    @Override
    public int compareTo(Product p2){
        return Long.compare(p2.thanhTien(), thanhTien());
    }

    @Override
    public String toString(){
        return maMH + " " + tenMH + " " + soLuong + " " + donGia + " " + chietKhau + " " + thanhTien();
    }
}
