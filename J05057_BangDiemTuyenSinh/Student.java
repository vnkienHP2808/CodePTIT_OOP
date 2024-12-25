package J05057_BangDiemTuyenSinh;

public class Student {
    private String maTS, tenTS;
    private double diemToan, diemLy, diemHoa, diemTong;

    public Student(String maTS, String tenTS, double diemToan, double diemLy, double diemHoa) {
        this.maTS = maTS;
        this.tenTS = tenTS;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTong = diemHoa + diemLy + diemToan*2;
    }

    public String getKV(){
        return maTS.substring(0, 3);
    }

    public double diemUuTien(){
        if(getKV().equals("KV1")) return 0.5;
        if(getKV().equals("KV2")) return 1.0;
        return 2.5;
    }

    public String ketQua(){
        if(diemTong + diemUuTien() < 24) return "TRUOT";
        return "TRUNG TUYEN";
    }

    public String chuanHoa(double score){
        if (score == (int) score)
            return Integer.toString((int) score);
        return String.format("%.1f", score);
    }

    @Override
    public String toString(){
        return maTS + " " + tenTS + " " + chuanHoa(diemUuTien()) + " " + chuanHoa(diemTong) + " " + ketQua();
    }
}
