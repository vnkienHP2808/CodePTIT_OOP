package J05018_BangDiemHocSinh;

import java.text.DecimalFormat;

public class Student {
    private int stt;
    private String id;
    private String name;
    private double toan;
    private double tiengViet;
    private double ngoaiNgu;
    private double vatLi;
    private double hoaHoc;
    private double sinhHoc;
    private double lichSu;
    private double dia;
    private double GDCD;
    private double congNghe;
    private double average;

    public Student(int stt, String id, String name, double toan, double tiengViet, double ngoaiNgu, double vatLi, double hoaHoc, double sinhHoc, double lichSu, double dia, double GDCD, double congNghe) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.tiengViet = tiengViet;
        this.ngoaiNgu = ngoaiNgu;
        this.vatLi = vatLi;
        this.hoaHoc = hoaHoc;
        this.sinhHoc = sinhHoc;
        this.lichSu = lichSu;
        this.dia = dia;
        this.GDCD = GDCD;
        this.congNghe = congNghe;
        double avg = (toan*2f + tiengViet*2f + ngoaiNgu + vatLi + hoaHoc + sinhHoc + lichSu + dia + GDCD + congNghe) / 12f;
        this.average = Math.round(avg * 10f) / 10f;
    }

    public int getStt() {
        return stt;
    }

    public double getAverage() {
        return average;
    }

    private String xepLoai() {
        if (average >= 9f) {
            return "XUAT SAC";
        }
        if (average >= 8f) {
            return "GIOI";
        }
        if (average >= 7f) {
            return "KHA";
        }
        if (average >= 5f) {
            return "TB";
        }
        return "YEU";
    }

    public String toString(){

        DecimalFormat df = new DecimalFormat(".0");
        return id + " " + name + " " + df.format(average) + " " + xepLoai();
    }

}
