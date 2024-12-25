package J05071_TinhCuocDTCoDinh1;

public class City {
    private String maVung, ten;
    private int giaCuoc;

    public City(String maVung, String ten, int giaCuoc) {
        this.maVung = maVung;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }

    public String getMaVung() {
        return maVung;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaCuoc() {
        return giaCuoc;
    }
}
