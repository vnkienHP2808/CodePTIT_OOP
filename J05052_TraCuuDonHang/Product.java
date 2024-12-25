package J05052_TraCuuDonHang;

public class Product {
    private String tenSP, maSP;
    private long donGia, soLuong, giamGia;

    public Product(String tenSP, String maSP, long donGia, long soLuong) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.donGia = donGia;
        this.soLuong = soLuong;

        if(maSP.charAt(maSP.length()-1) == '1') this.giamGia = 50*donGia*soLuong/100;
        else this.giamGia = 30*donGia*soLuong/100;
    }

    public String soThuTu(){
        return maSP.substring(1, 4);
    }

    @Override
    public String toString(){
        return tenSP + " " + maSP + ' ' + soThuTu() + " " + giamGia + " " + (donGia*soLuong - giamGia);
    }
}
