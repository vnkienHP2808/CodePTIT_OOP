package J05082_DanhSachKhachHang;

public class Customer implements Comparable<Customer>{
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

    public Customer(String maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String dangChuanNgaySinh(){
        StringBuilder s = new StringBuilder(ngaySinh);
        if(s.charAt(1) == '/') s.insert(0, "0");
        if(s.charAt(4) == '/') s.insert(3, "0");
        return s.toString();
    }

    public String dangChuanHoTen(){
        String[] str = tenKH.split("\\s+");
        String ten = "";
        for(String s : str){
            ten += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        return ten;
    }

    @Override
    public int compareTo(Customer person2){
        int ngay1 = Integer.parseInt(dangChuanNgaySinh().substring(0,2));
        int thang1 = Integer.parseInt(dangChuanNgaySinh().substring(3, 5));
        int nam1 = Integer.parseInt(dangChuanNgaySinh().substring(6));

        int ngay2 = Integer.parseInt(person2.dangChuanNgaySinh().substring(0,2));
        int thang2 = Integer.parseInt(person2.dangChuanNgaySinh().substring(3, 5));
        int nam2 = Integer.parseInt(person2.dangChuanNgaySinh().substring(6));
        if(nam1 != nam2) return nam1 - nam2;
        if(thang1 != thang2) return thang1 - thang2;
        return ngay1 - ngay2;
    }

    @Override
    public String toString(){
        return maKH + " " + dangChuanHoTen() + gioiTinh + " " + diaChi + " " + dangChuanNgaySinh();
    }

}
