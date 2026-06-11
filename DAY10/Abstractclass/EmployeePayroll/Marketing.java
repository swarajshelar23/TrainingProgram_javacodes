package DAY10.Abstractclass.EmployeePayroll;

public class Marketing extends Employee {

    Marketing(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateAnnualPay() {
        double incentive = 2000;
        return (salary + incentive) * 12;
    }
}