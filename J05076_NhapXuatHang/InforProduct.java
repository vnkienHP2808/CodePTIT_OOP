package J05076_NhapXuatHang;

public class InforProduct {
    private String maSP;
    private long soLuongNhap, donGiaNhap, soLuongXuat;
    private Product product;

    public InforProduct(String maSP, long soLuongNhap, long donGiaNhap, long soLuongXuat, Product product) {
        this.maSP = maSP;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
        this.product = product;
    }

    public long tongGiaTriNhap(){
        return soLuongNhap*donGiaNhap;
    }

    public long tongGiaTriXuat(){
        long tongGiaTri = soLuongXuat*donGiaNhap;
        return tongGiaTri + tongGiaTri*product.thue()/100;
    }

    @Override
    public String toString(){
        return maSP + " " + product.tenSP + " " + tongGiaTriNhap() + " " + tongGiaTriXuat();
    }
}
