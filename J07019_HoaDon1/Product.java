package J07019_HoaDon1;

public class Product {
    private String maSP, tenSP;
    private long gia1, gia2;


    public Product(String maSP, String tenSP, long gia1, long gia2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public long getGia1() {
        return gia1;
    }

    public long getGia2() {
        return gia2;
    }

    public String getTenSP() {
        return tenSP;
    }
}
