package bai3_thuchanh3;

public class Student implements Comparable<Student>{
    private String maSV, tenSV, lop, email, sdt;

    public Student(String maSV, String tenSV, String lop, String email, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.email = email;
        this.sdt = "0"+sdt;
    }

    @Override
    public int compareTo(Student s2){
        if(!lop.equals(s2.lop)) return lop.compareTo(s2.lop);
        return maSV.compareTo(s2.maSV);
    }

    @Override
    public String toString(){
        return maSV + " " + tenSV + " " + lop + " " + email + " " + sdt;
    }
}
