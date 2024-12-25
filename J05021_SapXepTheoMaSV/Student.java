package J05021_SapXepTheoMaSV;

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



    public int compareTo(Student person2) {
        return this.maSV.compareTo(person2.maSV);
    }

    public String toString(){
        return maSV + " " + tenSV + " " + lopSV + " " + email;
    }
}
