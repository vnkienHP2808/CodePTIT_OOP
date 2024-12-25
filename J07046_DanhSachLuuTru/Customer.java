package J07046_DanhSachLuuTru;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable<Customer>{
    private String maKH, tenKH, maP;
    private LocalDate ngayDen, ngayDi;

    public Customer(String maKH, String tenKH, String maP, String ngayDen, String ngayDi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maP = maP;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.ngayDen = LocalDate.parse(ngayDen, dtf);
        this.ngayDi = LocalDate.parse(ngayDi, dtf);
    }

    public long soNgayLuuTru(){
        return ChronoUnit.DAYS.between(ngayDen, ngayDi);
    }
    
    @Override
    public int compareTo(Customer o2){
        return Long.compare(o2.soNgayLuuTru(), soNgayLuuTru());
    }

    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + maP + " " + soNgayLuuTru();
    }
}
