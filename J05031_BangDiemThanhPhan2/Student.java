package J05031_BangDiemThanhPhan2;

import java.text.DecimalFormat;

public class Student {
    private String maSV;
    private String tenSV;
    private String lopSV;
    private double diem1, diem2, diem3;

    public Student(String maSV, String tenSV, String lopSV, double diem1, double diem2, double diem3) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public int compareTo(Student stu2){
        return tenSV.compareTo(stu2.tenSV);
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat(".0");
        return maSV + " " + tenSV + " " + lopSV + " " + df.format(diem1) + " " + df.format(diem2) + " " + df.format(diem3);
    }
}
