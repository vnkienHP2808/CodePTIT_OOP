package J07020_HoaDon2;

public class Bill {
    private String maHD, maKH, maSP;
    private int SL;
    private Customer cus;
    private Product pro;

    public Bill(String maHD, String maKH, String maSP, int SL, Customer cus, Product pro) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maSP = maSP;
        this.SL = SL;
        this.cus = cus;
        this.pro = pro;
    }



    @Override
    public String toString(){
        return maHD + " " + cus.getTenKH() + " " + cus.getDiaChi() + " "
                + pro.getTenSP() + " " + pro.getDonVi() + " " + pro.getGiaMua() + " " + pro.getGiaBan() + " "
                + SL + " " + SL* pro.getGiaBan();
    }
}
