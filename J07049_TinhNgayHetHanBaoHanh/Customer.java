package J07049_TinhNgayHetHanBaoHanh;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer{
    private String maKH, tenKH, diaChi, maSP1;
    private LocalDate ngayMua;
    private int soLuong;
    private Product product;

    public Customer(String maKH, String tenKH, String diaChi, String maSP1, int soLuong, String ngayMua, Product product) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.maSP1 = maSP1;
        this.soLuong = soLuong;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.ngayMua = LocalDate.parse(ngayMua, df);
        this.product = product;
    }

    public String getMaKH() {
        return maKH;
    }

    public int total(){
        return product.getGiaBan() * soLuong;
    }

    public LocalDate getEndDate(){
        return ngayMua.plusMonths(product.getBaoHanh());
    }



    @Override
    public String toString(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return maKH + " " + tenKH + " " + diaChi + " " + maSP1 + " " + total() + " " + getEndDate().format(df);
    }
}
