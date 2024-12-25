package J07019_HoaDon1;

public class Bill {
    private String maHD;
    private long SL;
    private Product product;
    private int loai;

    public Bill(String maHD, long SL, Product product, int loai) {
        this.maHD = maHD;
        this.SL = SL;
        this.product = product;
        this.loai = loai;
    }

    public int giamGia(){
        if(SL >= 150) return 50;
        if(SL >= 100) return 30;
        if(SL >= 50) return 15;
        return 0;
    }

    public long thanhTien(){
        if(loai == 1) return SL*product.getGia1();
        return SL*product.getGia2();
    }

    @Override
    public String toString(){
        return maHD + " " + product.getTenSP() + " " + (giamGia()*thanhTien()/100) + " " + (thanhTien() - giamGia()*thanhTien()/100);
    }
}
