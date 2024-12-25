package J05067_QuanLiKhoXangDau;

public class Fuel {
    private String maDonHang;
    private long soLuong;

    public Fuel(String maDonHang, long soLuong) {
        this.maDonHang = maDonHang;
        this.soLuong = soLuong;
    }

    public String hangSX(){
        String tmp = maDonHang.substring(3);
        if(tmp.equals("BP")) return "British Petro";
        if(tmp.equals("ES")) return "Esso";
        if(tmp.equals("SH")) return "Shell";
        if(tmp.equals("CA")) return "Castrol";
        if(tmp.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }

    public long tienThue(){
        if(maDonHang.substring(3).equals("TN")) return 0;
        if(maDonHang.charAt(0) == 'X') return 3840*soLuong;
        if(maDonHang.charAt(0) == 'D') return  392*soLuong;
        return 194*soLuong;
    }

    public long donGia(){
        if(maDonHang.charAt(0) == 'X') return 128000;
        if(maDonHang.charAt(0) == 'D') return 11200;
        return 9700;
    }

    @Override
    public String toString(){
        return maDonHang + ' ' + hangSX() + " " + donGia() + " " + tienThue() + " " + (tienThue() + soLuong*donGia());
    }
}
