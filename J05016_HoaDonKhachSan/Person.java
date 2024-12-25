package J05016_HoaDonKhachSan;
import java.text.*;
import java.util.*;


public class Person implements Comparable<Person>{
    private String maKH, tenKH, soPhong;
    private Date ngayNhan, ngayTra;
    private long tienDV;

    public Person(String maKH, String tenKH, String soPhong, String ngayNhan, String ngayTra, long tienDV) throws ParseException {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyy").parse(ngayNhan);
        this.ngayTra = new SimpleDateFormat("dd/MM/yyy").parse(ngayTra);
        this.tienDV = tienDV;
    }

    public int giaTien1Tang(){
        int tang = Integer.parseInt(soPhong.substring(0,1));
        if(tang == 1) return 25;
        if(tang == 2) return 34;
        if(tang == 3) return 50;
        return 80;
    }

    public long soNgay(){
        long k = ngayTra.getTime() - ngayNhan.getTime();
        return k/(24*60*60*1000) + 1;
    }

    public long thanhTien() {
        return soNgay() * giaTien1Tang() + tienDV;
    }

    @Override
    public int compareTo(Person p2){
        return Long.compare(p2.thanhTien(), thanhTien());
    }

    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + soPhong + " " + soNgay() + " " + thanhTien();
    }
}
