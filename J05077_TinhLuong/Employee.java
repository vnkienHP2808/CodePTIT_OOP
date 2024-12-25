package J05077_TinhLuong;

public class Employee {
    String maNV, tenNV;
    long luongCoBan, soNgayCong;
    private Work work;

    public Employee(String maNV, String tenNV, long luongCoBan, long soNgayCong, Work work) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.work = work;
    }

    public int heSo(){
        char type = maNV.charAt(0);
        int years = Integer.parseInt(maNV.substring(1, 3));
        switch (type) {
            case 'A':
                if (years >= 1 && years <= 3)   return 10;
                if (years >= 4 && years <= 8)   return 12;
                if (years >= 9 && years <= 15)   return 14;
                if (years >= 16)   return 20;
                break;
            case 'B':
                if (years >= 1 && years <= 3)   return 10;
                if (years >= 4 && years <= 8)   return 11;
                if (years >= 9 && years <= 15)   return 13;
                if (years >= 16)   return 16;
                break;
            case 'C':
                if (years >= 1 && years <= 3)   return 9;
                if (years >= 4 && years <= 8)   return 10;
                if (years >= 9 && years <= 15)   return 12;
                if (years >= 16)   return 14;
                break;
            case 'D':
                if (years >= 1 && years <= 3)   return 8;
                if (years >= 4 && years <= 8)   return 9;
                if (years >= 9 && years <= 15)   return 11;
                if (years >= 16)   return 13;
                break;
        }
        return 0;
    }

    public long luongThang(){
        return luongCoBan * soNgayCong * heSo() * 1000;
    }

    @Override
    public String toString(){
        return maNV + " " + tenNV + " " + work.getTenPhong() + luongThang();
    }
}
