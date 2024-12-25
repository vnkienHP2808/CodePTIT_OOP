package J06005_QuanLiBanHang1;

public class Product {
    private String tenMH, donVi;
    private long giaMua, giaBan;

    public Product(String tenMH, String donVi, long giaMua, long giaBan) {
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDonVi() {
        return donVi;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }
}
