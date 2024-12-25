package J06001_TinhToanHoaDonBanQuanAo;

public class Product {
    private String maSP, tenSP;
    private long  donGia1, donGia2;

    public Product(String maSP, String tenSP, long donGia1, long donGia2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getDonGia1() {
        return donGia1;
    }

    public long getDonGia2() {
        return donGia2;
    }
}
