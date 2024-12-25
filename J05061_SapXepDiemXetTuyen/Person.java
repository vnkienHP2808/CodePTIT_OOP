package J05061_SapXepDiemXetTuyen;

public class Person implements Comparable<Person> {
    private String maTS, tenTS, ngaySinh;
    private double diemLyThuyet, diemThucHanh;

    public Person(String maTS, String tenTS, String ngaySinh, double diemLyThuyet, double diemThucHanh) {
        this.maTS = maTS;
        this.tenTS = tenTS;
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public double diemThuong(){
        if(diemLyThuyet >= 8 && diemThucHanh >= 8) return 1;
        if(diemLyThuyet >= 7.5 && diemThucHanh >= 7.5) return 0.5;
        return 0;
    }

    public int diemTong(){
        return (int) Math.min(10, Math.round((diemLyThuyet + diemThucHanh)/2 + diemThuong()));
    }

    public String xepLoai(){
        if(diemTong() == 7) return "Kha";
        if(diemTong() == 8) return "Gioi";
        if(diemTong() == 9 || diemTong() == 10) return "Xuat sac";
        if(diemTong() < 5) return "Truot";
        return "Trung binh";
    }

    public int tuoi(){
        return 2021- Integer.parseInt(ngaySinh.substring(6));
    }

    @Override
    public int compareTo(Person person2){
        if(diemTong() != person2.diemTong()) return Double.compare(person2.diemTong(), diemTong());
        return maTS.compareTo(person2.maTS);
    }

    @Override
    public String toString(){
        return maTS + " " + tenTS + " " + tuoi() + " " + diemTong() + " " + xepLoai();
    }
}