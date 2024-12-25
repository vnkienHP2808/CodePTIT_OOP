package J05069_CLBBongDa1;

public class Match {
    private String maTranDau;
    private int soCDV;
    private Club club;

    public Match(String maTranDau, int soCDV, Club club) {
        this.maTranDau = maTranDau;
        this.soCDV = soCDV;
        this.club = club;
    }

    public int doanhThu(){
        return soCDV * club.getGiaVe();
    }

    @Override
    public String toString(){
        return maTranDau + " " + club.getTenCLB() + " " + doanhThu();
    }
}
