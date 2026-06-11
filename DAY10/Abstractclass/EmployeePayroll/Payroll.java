package DAY10.Abstractclass.EmployeePayroll;

public class Payroll {

    public static void processPayroll(Employee emp) {
        System.out.println(emp);
        System.out.println("Annual Pay: $" + emp.calculateAnnualPay());
        System.out.println("----------------------------");
    }
}