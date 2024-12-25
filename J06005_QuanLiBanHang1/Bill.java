package J06005_QuanLiBanHang1;

public class Bill implements Comparable<Bill>{
    private String maHD;
    private long soLuong;
    private Customer customer;
    private Product product;

    public Bill(String maHD, Customer customer, Product product, long soLuong) {
        this.maHD = maHD;
        this.customer = customer;
        this.product = product;
        this.soLuong = soLuong;
    }
    public long thanhTien(){
        return soLuong* product.getGiaBan();
    }

    public long loiNhuan(){
        return soLuong * (product.getGiaBan() - product.getGiaMua());
    }

    @Override
    public int compareTo(Bill b2){
        if(b2.loiNhuan() != loiNhuan()) return Long.compare(b2.loiNhuan(), loiNhuan());
        return maHD.compareTo(b2.maHD);
    }

    @Override
    public String toString(){
        return maHD + " " + customer.getTenKH() + " " + customer.getDiaChi() + " " + product.getTenMH() + " " + soLuong + " " + thanhTien() + " " + loiNhuan();
    }
}
