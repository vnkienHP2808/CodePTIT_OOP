package J04013;

public class Student {
    private String id;
    private String name;
    private double mathPoint;
    private double physicPoint;
    private double chemistryPoint;

    public Student(String id, String name, double mathPoint, double physicPoint, double chemistryPoint) {
        this.id = id;
        this.name = name;
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
    }
    public String bonusPoint(){
        String kv = this.id.substring(0,3);
        if(kv.equals("KV1")) return "0.5";
        else if(kv.equals("KV2")) return "1";
        return "2.5";
    }
    public double Point(){
        return this.mathPoint*2 + this.chemistryPoint + this.physicPoint;
    }

    public String toStringPoint(){
        double point = Point();
        double x = point - (int)point;
        if(x == 0) return ((int)point)+"";
        return point+"";
    }

    public String toString(){
        String kv = this.id.substring(0,3);
        String result;
        double finalPoint = Point();
        if(kv.equals("KV1")) finalPoint += 0.5;
        else if(kv.equals("KV2")) finalPoint += 1;
        else finalPoint += 2.5;
        if(finalPoint >= 24) return this.id + " " + this.name + " " + this.bonusPoint() + " " + toStringPoint() + " " + "TRUNG TUYEN";
        return this.id + " " + this.name + " " + this.bonusPoint() + " " + toStringPoint() + " " + "TRUOT";
    }
}
