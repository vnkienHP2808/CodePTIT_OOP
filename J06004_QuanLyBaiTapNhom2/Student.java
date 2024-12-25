package J06004_QuanLyBaiTapNhom2;

public class Student implements Comparable<Student>{
    private String maSV, tenSV, sdt;
    private int nhom;

    public Student(String maSV, String tenSV, String sdt, int nhom) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getNhom() {
        return nhom;
    }

    @Override
    public int compareTo(Student p2){
        return maSV.compareTo(p2.maSV);
    }

    @Override
    public String toString(){
        return maSV + " " + tenSV + " " + sdt + " " + nhom;
    }
}
