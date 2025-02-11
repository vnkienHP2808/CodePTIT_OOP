package J05026_DanhSachGVTheoBoMon;

public class Teacher {
    private String maGV;
    private String tenGV;
    private String chuyenNganh;

    public Teacher(String maGV, String tenGV, String chuyenNganh) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public String rutGon(){
        String[] a = chuyenNganh.split("\\s+");
        String tmp = "";
        for(int i = 0; i < a.length; i++){
            tmp += a[i].substring(0, 1).toUpperCase();
        }
        return tmp;
    }

    public String toString(){
        return maGV + " " + tenGV + " " + rutGon();
    }
}