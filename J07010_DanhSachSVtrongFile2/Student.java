package J07010_DanhSachSVtrongFile2;

import java.text.DecimalFormat;

public class Student {
    private String maSV, tenSV, lopSV, ngaySinh;
    private double gpa;

    public Student(String maSV, String tenSV, String lopSV, String ngaySinh, double gpa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String chuanHoa(){
        StringBuilder tmp = new StringBuilder(ngaySinh);
        if(tmp.charAt(1) == '/') tmp.insert(0, "0");
        if(tmp.charAt(4) == '/') tmp.insert(3, "0");
        return tmp.toString();
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat(".00");
        return maSV + " " + tenSV + " " + lopSV + " " + chuanHoa() + " " + df.format(gpa);
    }
}
