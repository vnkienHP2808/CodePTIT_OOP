package J05028_DanhSachDoanhNghiepNhanSVThucTap1;

public class Company {
    private String maDN;
    private String tenDN;
    private int soLuong;

    public Company(String maDN, String tenDN, int soLuong) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int compareTo(Company cpn2){
        return maDN.compareTo(cpn2.maDN);
    }

    public String toString(){
        return maDN + " " + tenDN + " " +soLuong;
    }
}
