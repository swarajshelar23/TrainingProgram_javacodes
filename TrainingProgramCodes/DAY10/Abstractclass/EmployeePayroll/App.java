package DAY10.Abstractclass.EmployeePayroll;

public class App {

    public static void main(String[] args) {

        Employee emp1 = new Developer(1, "Alice", 50000);
        Employee emp2 = new HR(2, "Bob", 100000);
        Employee emp3 = new Marketing(3, "Charlie", 75000);

        Payroll.processPayroll(emp1);
        Payroll.processPayroll(emp2);
        Payroll.processPayroll(emp3);
    }
}