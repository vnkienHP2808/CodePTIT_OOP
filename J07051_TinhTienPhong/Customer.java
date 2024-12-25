package J07051_TinhTienPhong;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable<Customer>{
    private String maKH, tenKH, soP;
    private LocalDate ngayNhanP, ngayTraP;
    private int giaTien;

    private String chuanHoa(String s){
        String tmp = "";
        String[] line = s.trim().split("\\s+");
        for(String ss : line){
            tmp += ss.substring(0,1).toUpperCase() + ss.substring(1).toLowerCase();
            tmp += " ";
        }
        return tmp.trim();
    }

    public Customer(String maKH, String tenKH, String soP, String ngayNhanP, String ngayTraP, int giaTien) {
        this.maKH = maKH;
        this.tenKH = chuanHoa(tenKH);
        this.soP = soP;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.ngayNhanP = LocalDate.parse(ngayNhanP, dtf);
        this.ngayTraP = LocalDate.parse(ngayTraP, dtf);
        this.giaTien = giaTien;
    }

    public long soNgayO(){
        return ChronoUnit.DAYS.between(ngayNhanP, ngayTraP) + 1;
    }

    public long thanhTien(){
        int tang = Integer.parseInt(soP.substring(0,1));
        int tienPerTang = 0;
        if(tang == 1) tienPerTang = 25;
        else if(tang == 2) tienPerTang = 34;
        else if(tang == 3) tienPerTang = 50;
        else tienPerTang = 80;

        return tienPerTang*soNgayO() + giaTien;
    }

    @Override
    public int compareTo(Customer c2){
        return Long.compare(c2.thanhTien(), thanhTien());
    }

    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + soP + " " + soNgayO() + " " + thanhTien();
    }
}
