package J07048_DanhSachSP2;

public class Product implements Comparable<Product>{
    private String maSP, tenSP;
    private int giaBan, baoHanh;

    public Product(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }
    
    @Override
    public int compareTo(Product p2){
        if(giaBan != p2.giaBan) return Integer.compare(p2.giaBan, giaBan);
        return maSP.compareTo(p2.maSP);
    }

    
    @Override
    public String toString(){
        return maSP + " " + tenSP + " " + giaBan + " " + baoHanh;
    }
}
