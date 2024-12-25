package J04005;

import java.text.DecimalFormat;

class Students {
    private String name;
    private String bDay;
    private double diem1, diem2, diem3, tongDiem;

    public Students(String name, String bDay, double diem1, double diem2, double diem3) {
        this.name = name;
        this.bDay = bDay;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;

    }
    public String toString(){
        double tongdiem = diem1 + diem2 + diem3;
        DecimalFormat df = new DecimalFormat(".0");
        return this.name + " " + this.bDay + " " +df.format(tongdiem)  ;
    }
}
