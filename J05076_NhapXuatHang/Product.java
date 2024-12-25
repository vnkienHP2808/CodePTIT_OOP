package J05076_NhapXuatHang;

public class Product {
    String maSP, tenSP, xepLoai;

    public Product(String maSP, String tenSP, String xepLoai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.xepLoai = xepLoai;
    }

    public Product(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }


    public long thue(){
        if(xepLoai.equals("A")) return 8;
        if(xepLoai.equals("B")) return 5;
        return 2;
    }
}
