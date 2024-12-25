package J04012;

public class Employee {
    private String id;
    private String name;
    private int salary;
    private int dayWork;
    private String duty;

    public Employee(String id, String name, int salary, int dayWork, String duty) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dayWork = dayWork;
        this.duty = duty;
    }

    public int salaryDayWork(){
        return this.dayWork*this.salary;
    }

    public int bonus01(){
        if(this.dayWork >= 25) return salaryDayWork()*20/100;
        else if(this.dayWork >= 22 && this.dayWork < 25) return salaryDayWork()*10/100;
        return 0;
    }

    public int bonus02(){
        if(this.duty.equals("GD")) return 250000;
        else if(this.duty.equals("PGD")) return 200000;
        else if(this.duty.equals("TP")) return 180000;
        return 150000;
    }

    public int finalSalary(){
        return salaryDayWork() + bonus01() + bonus02();
    }

    public String toString(){
        return this.id + " " + this.name + " " + salaryDayWork() + " " + bonus01() + " " + bonus02() + " " + finalSalary();
    }
}
