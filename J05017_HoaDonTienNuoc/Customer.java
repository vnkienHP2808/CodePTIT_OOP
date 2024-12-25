package J05017_HoaDonTienNuoc;

public class Customer implements Comparable<Customer>{
    private String maKH, tenKh;
    private int chiSoCu, chiSoMoi;

    public Customer(String maKH, String tenKh, int chiSoCu, int chiSoMoi) {
        this.maKH = maKH;
        this.tenKh = tenKh;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public int soKhoi(){
        return chiSoMoi - chiSoCu;
    }

    public int donGia(){
        int x = soKhoi();
        if(x >= 0 && x <= 50) return 100;
        if(x <= 100) return 150;
        return 200;
    }

    public int phuPhi(){
        if(soKhoi() >= 0 && soKhoi() <= 50) return 2;
        if(soKhoi() <= 100) return 3;
        return 5;
    }

    public int thanhTien(){
        int chiSo = soKhoi();
        int tong = 0;
        if(chiSo > 100){
            tong += 200*(chiSo - 100);
            chiSo = 100;
        }
        if(chiSo > 50){
            tong += 150*(chiSo - 50);
            chiSo = 50;
        }
        if(chiSo > 0){
            tong += 100*chiSo;
        }
        return (int) Math.round(tong * (1 + phuPhi()*1.0/100));
    }

    @Override
    public int compareTo(Customer c2){
        return Integer.compare(c2.thanhTien(), thanhTien());
    }

    @Override
    public String toString(){
        return maKH + " " + tenKh + " " + thanhTien();
    }
}
