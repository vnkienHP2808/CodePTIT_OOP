package J05032_Oldest_Youngest;

public class Person {
    private String ten;
    private String ngaySinh;

    public Person(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public int compareTo(Person person2){
        int ngay1 = Integer.parseInt(ngaySinh.substring(0, 2));
        int thang1 = Integer.parseInt(ngaySinh.substring(3, 5));
        int nam1 = Integer.parseInt(ngaySinh.substring(6));

        int ngay2 = Integer.parseInt(person2.ngaySinh.substring(0, 2));
        int thang2 = Integer.parseInt(person2.ngaySinh.substring(3,5));
        int nam2 = Integer.parseInt(person2.ngaySinh.substring(6));

        if(nam1 != nam2) return nam1 - nam2;
        else if (thang1 != thang2) return thang1 - thang2;
        return ngay1 - ngay2;
    }

    public String toString(){
        return ten;
    }
}
