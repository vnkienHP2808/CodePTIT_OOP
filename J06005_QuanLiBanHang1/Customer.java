package J06005_QuanLiBanHang1;

public class Customer {
    private String tenKH, gioiTinh, ngaySinh, diaChi;

    public Customer(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTenKH() {
        return tenKH;
    }


    public String getDiaChi() {
        return diaChi;
    }
}
