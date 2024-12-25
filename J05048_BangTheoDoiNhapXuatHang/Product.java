package J05048_BangTheoDoiNhapXuatHang;

public class Product {
    private String maSP;
    private long soLuongNhap, soLuongXuat, donGia;

    public Product(String maSP, long soLuongNhap, long soLuongXuat, long donGia) {
        this.maSP = maSP;
        this.soLuongNhap = soLuongNhap;
        this.soLuongXuat = soLuongXuat;
        this.donGia = donGia;
    }

    public long tien(){
        return soLuongXuat*donGia;
    }

    public long thue(){
        if(maSP.charAt(0) == 'A'){
            if(maSP.charAt(maSP.length()-1) == 'Y') return 8*tien()/100;
            else return 11*tien()/100;
        }
        else{
            if(maSP.charAt(maSP.length()-1) == 'Y') return 17*tien()/100;
        }
        return 22*tien()/100;
    }
    public String toString(){
        return maSP + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien() + " " + thue();
    }
}
