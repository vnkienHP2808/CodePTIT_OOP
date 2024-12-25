package J05070_CLBBongDa2;

public class Club {
    private String maCLB, tenCLB;
    private int giaVe;

    public Club(String maCLB, String tenCLB, int giaVe) {
        this.maCLB = maCLB;
        this.tenCLB = tenCLB;
        this.giaVe = giaVe;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public String getTenCLB() {
        return tenCLB;
    }
}
