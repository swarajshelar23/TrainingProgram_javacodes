package DAY10.Abstractclass.EmployeePayroll;

public class Developer extends Employee {

    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateAnnualPay() {
        double bonus = 5000;
        return (salary + bonus) * 12;
    }
}