package DAY10.Abstractclass.Accounts;

public class CorporateAccount extends Account {

    CorporateAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $1000 must be maintained.");
        }
    }
}