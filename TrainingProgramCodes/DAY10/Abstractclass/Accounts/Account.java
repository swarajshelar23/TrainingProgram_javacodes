package DAY10.Abstractclass.Accounts;

public abstract class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    final void deposit(double amount) {
        balance += amount;
    }

    abstract void withdraw(double amount);


    public String toString(){
        return "Account Name: " + name + ", Balance: " + balance;
    }
}