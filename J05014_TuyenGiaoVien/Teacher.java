package J05014_TuyenGiaoVien;

import java.text.DecimalFormat;

public class Teacher implements Comparable<Teacher>{
    private String maGV, tenGV, maXetTuyen;
    private double diem1, diem2;

    public Teacher(String maGV, String tenGV, String maXetTuyen, double diem1, double diem2) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.maXetTuyen = maXetTuyen;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public String monThi(){
        String mon = maXetTuyen.substring(0,1);
        if(mon.equals("A")) return "TOAN";
        if(mon.equals("B")) return "LY";
        return "HOA";
    }

    public double diemCong(){
         int diem = Integer.parseInt(maXetTuyen.substring(1));
        if(diem == 1) return 2;
        if(diem == 2) return 1.5;
        if(diem == 3) return 1;
        return 0;
    }

    public double tongDiem(){
        return diem1*2 + diem2 + diemCong();
    }

    public String trangThai(){
        double diem = tongDiem();
        if(diem >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }

    @Override
    public int compareTo(Teacher t2){
        return Double.compare(t2.tongDiem(), tongDiem());
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat(".0");
        return maGV + " " + tenGV + " " + monThi() + " " + df.format(tongDiem()) + " " + trangThai();
    }
}
