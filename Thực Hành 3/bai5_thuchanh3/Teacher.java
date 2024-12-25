package bai5_thuchanh3;

import java.text.DecimalFormat;

public class Teacher {
    private String maGV, tenGV;
    private double gioDay;

    public Teacher(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.gioDay = 0;
    }

    public double getGioDay() {
        return gioDay;
    }

    public void setGioDay(double gioDay) {
        this.gioDay = gioDay;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat(".00");
        return tenGV + " " + df.format(gioDay);
    }
}
