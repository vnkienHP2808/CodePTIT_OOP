package J05080_LopHocPhan2;

public class InforClass implements Comparable<InforClass>{
    private String maMH, tenMH, nhomLop, tenGV;

    public InforClass(String maMH, String tenMH, String nhomLop, String tenGV) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhomLop = nhomLop;
        this.tenGV = tenGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    @Override
    public int compareTo(InforClass o2){
        if(!maMH.equals(o2.maMH)) return maMH.compareTo(o2.maMH);
        return nhomLop.compareTo(o2.nhomLop);
    }

    @Override
    public String toString(){
        return maMH + " " + tenMH + " " + nhomLop;
    }
}
