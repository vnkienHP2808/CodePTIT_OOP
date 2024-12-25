package J07037_DanhSachDoanhNghiep;

public class Business implements Comparable<Business>{
    private String maDN, tenDN, soSV;

    public Business(String maDN, String tenDN, String soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    @Override
    public int compareTo(Business o2){
        return maDN.compareTo(o2.maDN);
    }

    @Override
    public String toString(){
        return maDN + " " + tenDN + " " + soSV;
    }
}
