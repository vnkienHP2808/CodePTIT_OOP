package Practice;

public class Product {
    private String maMH, tenMH, donVi;
    private int giaMua, giaBan;

    public Product(String maMH, String tenMH, String donVi, int giaMua, int giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }
}
