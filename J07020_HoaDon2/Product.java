package J07020_HoaDon2;

public class Product {
    private String maSP, tenSP, donVi;
    private long giaMua, giaBan;

    public Product(String maSP, String tenSP, String donVi, long giaMua, long giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getTenSP() {
        return tenSP;
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
