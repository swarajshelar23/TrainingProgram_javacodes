package DAY10.Abstractclass.Accounts;

public class App {
    public static void main(String[] args) {

        CorporateAccount account = new CorporateAccount("Google", 5000);

        System.out.println("Initial Balance: " + account.balance);

        account.deposit(2000);
        System.out.println("After Deposit: " + account.balance);

        account.withdraw(3000);
        System.out.println("After Withdrawal: " + account.balance);

        account.withdraw(4000); // Should fail
        System.out.println("Final Balance: " + account.balance);



    }
}