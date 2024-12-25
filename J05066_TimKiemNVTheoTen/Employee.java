package J05066_TimKiemNVTheoTen;

public class Employee implements Comparable<Employee>{
    private String chucVu, heSoLuong, soHieu, tenNV;

    public Employee(String chucVu, String heSoLuong, String soHieu, String tenNV) {
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.soHieu = soHieu;
        this.tenNV = tenNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    @Override
    public int compareTo(Employee e2){
        if(!heSoLuong.equals(e2.heSoLuong)) return e2.heSoLuong.compareTo(heSoLuong);
        return soHieu.compareTo(e2.soHieu);
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s",tenNV, chucVu, soHieu, heSoLuong);
    }

}
