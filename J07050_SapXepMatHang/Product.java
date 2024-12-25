package J07050_SapXepMatHang;

import java.text.DecimalFormat;

public class Product implements Comparable<Product>{
    private String maMH, tenMH, nhomMH;
    private double giaMua, giaBan, loiNhuan;

    public Product(String maMH, String tenMH, String nhomMH, double giaMua, double giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhomMH = nhomMH;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public int compareTo(Product p2){
        return Double.compare(p2.loiNhuan, loiNhuan);
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat(".00");
        return maMH + " " + tenMH + " " + nhomMH + " " + df.format(loiNhuan);
    }
}
