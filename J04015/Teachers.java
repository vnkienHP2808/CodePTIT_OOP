package J04015;

public class Teachers {
    private String code;
    private String name;
    private int salary;

    public Teachers(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        String s1 = this.code.substring(0, 2);
        String s2 = this.code.substring(2);
        int hs = 0;
        int bonus = 0;
        if(s1.equals("HT")) bonus = 2000000;
        else if (s1.equals("HP")) bonus = 900000;
        else bonus = 500000;
        for(int i = 0; i < s2.length(); i++){
            hs = hs*10 + (s2.charAt(i) - '0');
        }
        return this.code + " " + this.name + " " + hs + " " + bonus + " " + (this.salary*hs + bonus);
    }

}
