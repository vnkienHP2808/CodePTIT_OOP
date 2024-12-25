package bai2_thuchanh3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>{
    private String maNV, tenNV;
    private Date gioVao, gioRa;

    public Employee(String maNV, String tenNV, String gioVao, String gioRa) throws ParseException {
        this.maNV = maNV;
        this.tenNV = tenNV;
        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm");
        this.gioVao = fmt.parse(gioVao);
        this.gioRa = fmt.parse(gioRa);
    }

    public long thoiGianLamViec(){
        return gioRa.getTime() - gioVao.getTime() - 60*60*1000;
    }

    public String trangThai(){
        if(thoiGianLamViec() >= 8*60*60*1000) return "DU";
        return "THIEU";
    }

    @Override
    public int compareTo(Employee e2){
        if(e2.thoiGianLamViec() != thoiGianLamViec()) return Long.compare(e2.thoiGianLamViec(), thoiGianLamViec());
        return maNV.compareTo(e2.maNV);
    }

    @Override
    public String toString(){
        long gio = thoiGianLamViec() / (60*60*1000);
        long phut = (thoiGianLamViec() - gio*3600000) / 60000;
        return maNV + " " + tenNV + " " + gio + " gio " + phut + " phut " + trangThai();
    }
}
