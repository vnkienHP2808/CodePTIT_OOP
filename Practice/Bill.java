package Practice;

public class Bill {
    private String maHD, maKH, maMH;
    private int soLuong;
    private Customer customers;
    private Product products;

    public Bill(String maHD, int soLuong, Customer customers, Product products) {
        this.maHD = maHD;
        this.soLuong = soLuong;
        this.customers = customers;
        this.products = products;
    }


    @Override
    public String toString(){
        return maHD + " " + customers;
    }
}
