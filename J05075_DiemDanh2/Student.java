package J05075_DiemDanh2;

public class Student {
    private String maSV, tenSV, lopSV;
    private int diemCC;

    public Student(String maSV, String tenSV, String lopSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLopSV() {
        return lopSV;
    }

    public void setDiemCC(int diemCC) {
        this.diemCC = diemCC;
    }

    public String trangThai(){
        if(diemCC == 0) return "KDDK";
        return "";
    }

    @Override
    public String toString(){
        return maSV + " " + tenSV + " " + lopSV + " " + diemCC + " " + trangThai();
    }
}
