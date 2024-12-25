package J04007;

public class Employees {
    private String name;
    private String id;
    private String sex;
    private String birthday;
    private String address;
    private String code;
    private String day;

    public Employees(String name, String id, String sex, String birthday, String address, String code, String day) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.code = code;
        this.day = day;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " " + this.birthday + " " + this.address + " " + this.code + " " + this.day;
    }
}
