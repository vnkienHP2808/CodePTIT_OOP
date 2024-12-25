package J05059_XacDinhDanhSachTrungTuyen;

public class Student implements Comparable<Student>{
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


    public double diemUuTien(){
        String KV = maTS.substring(0,3);
        if(KV.equals("KV1")) return 0.5;
        if(KV.equals("KV2")) return 1.0;
        return 2.5;
    }

    public double ketQua(){
        return diemTong + diemUuTien();
    }

    public String chuanHoa(double score){
        if (score == (int) score)
            return Integer.toString((int) score);
        return String.format("%.1f", score);
    }

    @Override
    public int compareTo(Student stu2){
        if(diemTong + diemUuTien() != stu2.diemUuTien() + stu2.diemTong)
            return Double.compare(stu2.diemUuTien() + stu2.diemTong, diemTong + diemUuTien());
        return maTS.compareTo(stu2.maTS);
    }

    @Override
    public String toString(){
        return maTS + " " + tenTS + " " + chuanHoa(diemUuTien()) + " " + chuanHoa(ketQua()) + " ";
    }
}

