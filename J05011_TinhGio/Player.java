package J05011_TinhGio;

public class Player {
    private String maNguoiChoi;
    private String tenNguoiChoi;
    private String gioVao;
    private String gioRa;

    public Player(String maNguoiChoi, String tenNguoiChoi, String gioVao, String gioRa) {
        this.maNguoiChoi = maNguoiChoi;
        this.tenNguoiChoi = tenNguoiChoi;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public int timeIn(){
        int hour = Integer.parseInt(gioVao.substring(0, 2));
        int minute = Integer.parseInt(gioVao.substring(3));
        return hour*60 + minute;
    }

    public int timeOut(){
        int hour = Integer.parseInt(gioRa.substring(0, 2));
        int minute = Integer.parseInt(gioRa.substring(3));
        if(hour*60 + minute < timeIn()) return hour*60 + minute + 24*60;
        return hour*60+minute;
    }

    public String toString() {
        return maNguoiChoi + " " + tenNguoiChoi + " " + (timeOut() - timeIn())/60 + " gio " + (timeOut() - timeIn())%60 + " phut";
    }
}

