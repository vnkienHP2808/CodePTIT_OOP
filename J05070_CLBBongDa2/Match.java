package J05070_CLBBongDa2;

public class Match implements Comparable<Match>{
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
    public int compareTo(Match m2){
        if(doanhThu() != m2.doanhThu()) return m2.doanhThu() - doanhThu();
        return club.getTenCLB().compareTo(m2.club.getTenCLB());
    }

    @Override
    public String toString(){
        return maTranDau + " " + club.getTenCLB() + " " + doanhThu();
    }
}

