package J06001_TinhToanHoaDonBanQuanAo;

public class Bill implements Comparable<Bill>{
    private String ma;
    private long soLuong;
    private Product product;

    public Bill(String ma, long soLuong, Product product) {
        this.ma = ma;
        this.soLuong = soLuong;
        this.product = product;
    }
    public long thanhTien(){
        if(ma.charAt(2) == '1') return soLuong*product.getDonGia1();
        return soLuong* product.getDonGia2();
    }

    public long giamGia(){
        if(soLuong >= 150) return 50*thanhTien()/100;
        else if(soLuong >= 100) return 30*thanhTien()/100;
        else if(soLuong >= 50) return 15*thanhTien()/100;
        return 0;
    }

    @Override
    public int compareTo(Bill b2){
        return ((int)(b2.thanhTien() - b2.giamGia())) - ((int)(thanhTien() - giamGia()));
    }

    @Override
    public String toString() {
        return ma + " " + product.getTenSP() + " " + giamGia() + " " + (thanhTien() - giamGia());
    }
}
