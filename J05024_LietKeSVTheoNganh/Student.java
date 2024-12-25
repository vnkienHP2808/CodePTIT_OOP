package J05024_LietKeSVTheoNganh;

public class Student {
    private String maSV;
    private String tenSV;
    private String lopSV;
    private String email;

    public Student(String maSV, String tenSV, String lopSV, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String toString(){
        return maSV + " " + tenSV + " " + lopSV + " " + email;
    }
}
