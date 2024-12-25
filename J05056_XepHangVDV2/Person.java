package J05056_XepHangVDV2;

public class Person {
    private int stt;
    private String maTS, hoTen, ngaySinh, thoiGianXuatPhat, thoiGianDenDich;

    public Person(String maTS, String hoTen, String ngaySinh, String thoiGianXuatPhat, String thoiGianDenDich) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.thoiGianXuatPhat = thoiGianXuatPhat;
        this.thoiGianDenDich = thoiGianDenDich;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaTS() {
        return maTS;
    }

    public int tuoi(){
        return 2021 - Integer.parseInt(ngaySinh.substring(6));
    }

    public int uuTien(){
        if(tuoi() < 18) return 0;
        if(tuoi() < 25) return 1;
        if(tuoi() < 32) return 2;
        return 3;
    }

    public int thanhTichThucTe(){
        int hh = Integer.parseInt(thoiGianXuatPhat.substring(0,2));
        int mm = Integer.parseInt(thoiGianXuatPhat.substring(3,5));
        int ss = Integer.parseInt(thoiGianXuatPhat.substring(6));

        int hh1 = Integer.parseInt(thoiGianDenDich.substring(0,2));
        int mm1 = Integer.parseInt(thoiGianDenDich.substring(3,5));
        int ss1 = Integer.parseInt(thoiGianDenDich.substring(6));

        int total_ss = hh*3600 + mm*60 + ss;
        int total_ss1 = hh1*3600 + mm1*60 + ss1;

        return total_ss1 - total_ss;
    }

    public int thanhTichXepHang(){
        return thanhTichThucTe() - uuTien();
    }

    public String chuanHoa(int n){
        return String.format("%02d:%02d:%02d", n/3600, (n%3600)/60, n%60);
    }

    @Override
    public String toString(){
        return maTS + " " + hoTen + " " + chuanHoa(thanhTichThucTe()) + " " + chuanHoa(uuTien()) + " " + chuanHoa(thanhTichXepHang()) + " " + stt;
    }
}
