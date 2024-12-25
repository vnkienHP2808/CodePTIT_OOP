package J05006_DanhSachDoiTuongNV;

public class Employee {
    private String id;
    private String name;
    private String sex;
    private String birthday;
    private String address;
    private String mst;
    private String day;

    public Employee(String id, String name, String sex, String birthday, String address, String mst, String day) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.mst = mst;
        this.day = day;
    }

    public String toString(){
        return id + " " + name + " " + sex + " " + birthday + " " + address + " " + mst + " " + day;
    }
}

