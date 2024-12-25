package J07034_DanhSachMonHoc;

public class Subject implements Comparable<Subject>{
    private String maMH, tenMH, soTC;

    public Subject(String maMH, String tenMH, String soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    @Override
    public int compareTo(Subject o2){
        return tenMH.compareTo(o2.tenMH);
    }

    @Override
    public String toString(){
        return maMH + " " + tenMH + " " + soTC;
    }
}
