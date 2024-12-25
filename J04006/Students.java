package J04006;

import java.text.DecimalFormat;

public class Students {
    private String name;
    private String lop;
    private String bDay;
    private double gpa;

    public Students(String name, String lop, String bDay, double gpa) {
        this.name = name;
        this.lop = lop;
        this.bDay = bDay;
        this.gpa = gpa;
    }

    public String toString(){
        StringBuilder s = new StringBuilder(this.bDay);
        if(s.charAt(1) == '/') s.insert(0, '0');
        if(s.charAt(4) == '/') s.insert(3, '0');
        DecimalFormat df = new DecimalFormat(".00");
        return "B20DCCN001" + " " + this.name + " " + this.lop + " " + s + " " + df.format(this.gpa);
    }
}
