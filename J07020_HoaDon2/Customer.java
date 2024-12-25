package J07020_HoaDon2;

public class Customer {
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

    public Customer(String maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = maKH;
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
