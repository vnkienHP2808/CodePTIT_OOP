package J05003_DanhSachDoiTuongSV1;

import java.text.DecimalFormat;

public class Student {
    private String id;
    private String name;
    private String Class;
    private String birthDay;
    private double gpa;

    public Student(String name, String aClass, String birthDay, double gpa) {
        this.name = name;
        Class = aClass;
        this.birthDay = birthDay;
        this.gpa = gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StringBuilder newBirthDay(){
        StringBuilder bd = new StringBuilder(birthDay);
        if(bd.charAt(1) == '/') bd.insert(0, "0");
        if(bd.charAt(4) == '/') bd.insert(3, "0");
        return bd;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat(".00");
        return id + " " + name + " " + Class + " " + " " + newBirthDay() + " " + df.format(gpa);
    }
}
