package DAY10.Abstractclass.EmployeePayroll;

public abstract class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateAnnualPay();

    @Override
    public String toString() {
        return "Employee ID: " + id +
                ", Name: " + name +
                ", Salary: " + salary;
    }
}