package J05035_DanhSachThucTap2;

public class Student {
    private int stt;
    private String maSV, tenSV, lopSV, email, DN;

    public Student(int stt, String maSV, String tenSV, String lopSV, String email, String DN) {
        this.stt = stt;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.email = email;
        this.DN = DN;
    }

    public String getDN() {
        return DN;
    }

    public int compareTo(Student stu2){
        return maSV.compareTo(stu2.maSV);
    }

    public String toString(){
        return stt + " " + maSV + " " + tenSV + " " + lopSV + " " + email + " " + DN;
    }
}
