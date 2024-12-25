package J05064_BangThuNhapGiaoVien;

public class Teacher {
    private String maGV, tenGV;
    private int luongCoBan;

    public Teacher(String maGV, String tenGV, int luongCoBan) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.luongCoBan = luongCoBan;
    }

    public int phuCap(){
        String tmp = maGV.substring(0, 2);
        if(tmp.equals("HT")) return 2000000;
        if(tmp.equals("HP")) return 900000;
        return 500000;
    }

    public int bacLuong(){
        return Integer.parseInt(maGV.substring(2));
    }

    public int thuNhap(){
        return luongCoBan*bacLuong() + phuCap();
    }

    @Override
    public String toString(){
        return maGV + " " + tenGV + " " + bacLuong() + " " + phuCap() + " " + thuNhap();
    }
}
