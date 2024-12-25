package J05009_TimThuKhoaKyThi;

import java.text.DecimalFormat;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private double diem1;
    private double diem2;
    private double diem3;
    private double diemTong;

    public Student(int id, String name, String birthday, double diem1, double diem2, double diem3) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemTong = diem1 + diem2 + diem3;
    }

    public int getId() {
        return id;
    }

    public double getDiemTong() {
        return diemTong;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat(".0");
        return id + " " + name + " " + birthday + " " + df.format(diemTong);
    }
}
