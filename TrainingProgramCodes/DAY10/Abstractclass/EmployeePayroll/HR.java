package DAY10.Abstractclass.EmployeePayroll;

public class HR extends Employee {

    HR(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateAnnualPay() {
        double allowance = 3000;
        return (salary + allowance) * 12;
    }
}