package J05050_TinhTienDien;

public class Customer{
    private String maKH, loaiKH;
    private long chiSoCu, chiSoMoi;

    public Customer(String maKH, String loaiKH, long chiSoCu, long chiSoMoi) {
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public long heSo(){
        if(loaiKH.equals("KD")) return 3;
        if(loaiKH.equals("NN")) return 5;
        if(loaiKH.equals("TT")) return 4;
        return 2;
    }

    public long thanhTien(){
        return (long)(chiSoMoi - chiSoCu)*heSo()*550;
    }

    public long phuTroi(){
        long sub = chiSoMoi - chiSoCu;
        if(sub < 50) return 0;
        if(sub <= 100) return Math.round(thanhTien()/100.0*35);
        return thanhTien();
    }

    public String toString(){
        return maKH + " " + heSo() + " " + thanhTien() + " " + phuTroi() + " " + (phuTroi() + thanhTien());
    }
}
