package J05025_SapXepDanhSachGiangVien;

public class Teacher {
    private String maGV;
    private String tenGV;
    private String chuyenNganh;

    public Teacher(String maGV, String tenGV, String chuyenNganh) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.chuyenNganh = chuyenNganh;
    }

    public String rutGon(){
        String[] a = chuyenNganh.split("\\s+");
        String tmp = "";
        for(int i = 0; i < a.length; i++){
            tmp += a[i].substring(0, 1).toUpperCase();
        }
        return tmp;
    }

    public String getTen(){
        String[] a = tenGV.split("\\s+");
        return a[a.length-1];
    }

    public int compareTo1(Teacher teacher2){
        return this.getTen().compareTo(teacher2.getTen());
    }

    public int compareTo2(Teacher teacher2){
        return maGV.compareTo(teacher2.maGV);
    }

    public String toString(){
        return maGV + " " + tenGV + " " + rutGon();
    }
}
