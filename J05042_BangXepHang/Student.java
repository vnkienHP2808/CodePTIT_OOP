package J05042_BangXepHang;

public class Student {
    private String tenSV;
    private int soBaiDung, soLuotSubmit;

    public Student(String tenSV, int soBaiDung, int soLuotSubmit) {
        this.tenSV = tenSV;
        this.soBaiDung = soBaiDung;
        this.soLuotSubmit = soLuotSubmit;
    }

    public int getSoBaiDung() {
        return soBaiDung;
    }

    public int getSoLuotSubmit() {
        return soLuotSubmit;
    }

    public int compareTo(Student stu2){
        return tenSV.compareTo(stu2.tenSV);
    }

    public String toString(){
        return tenSV + " " + soBaiDung + " " + soLuotSubmit;
    }
}
