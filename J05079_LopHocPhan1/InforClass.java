package J05079_LopHocPhan1;

public class InforClass implements Comparable<InforClass>{
    private String maMH, tenMH, nhomLop, tenGV;

    public InforClass(String maMH, String tenMH, String nhomLop, String tenGV) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhomLop = nhomLop;
        this.tenGV = tenGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    @Override
    public int compareTo(InforClass o2){
        return nhomLop.compareTo(o2.nhomLop);
    }

    @Override
    public String toString(){
        return nhomLop + " " + tenGV;
    }
}
