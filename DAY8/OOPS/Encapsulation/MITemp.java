package DAY8.OOPS.Encapsulation;

public class MITemp {
    public String name;
    public int Empid;
    private double Salary;


    MITemp(String name, int Empid, double Salary){
        this.name = name;
        this.Empid = Empid;
        this.Salary = Salary;
    }

    void showSalary(){
        System.out.println("Employee Salary: " + Salary);
    }

    void setSalary(double amt){
        this.Salary = amt;
    }



}
