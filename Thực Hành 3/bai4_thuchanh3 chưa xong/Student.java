package bai4_thuchanh3;

public class Student implements Comparable<Student>{
    private String maSV, tenSV, deTai, gioTT;

    public Student(String maSV, String tenSV, String deTai) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.deTai = deTai;
    }

    public void setGioTT(String gioTT) {
        this.gioTT = gioTT;
    }

    @Override
    public int compareTo(Student s2){
        return gioTT.compareTo(s2.gioTT);
    }
}
