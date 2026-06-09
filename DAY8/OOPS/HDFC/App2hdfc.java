package DAY8.OOPS.HDFC;

public class App2hdfc {
    public static void main(String[] args) {
        
        HDFC account1 = new HDFC("Swaraj", "1234567890", 5000.0);
        HDFC account2 = new HDFC("Kaustubh", "9876543210", 11111.0);
        HDFC account3 = new HDFC(null, null, 0.0);
        
        System.out.println("Account 1 details:");
        account1.displayAccountDetails();
        account1.deposit(2000.0);
        account1.withdraw(1500.0);
        


        System.out.println("Account 2 details:");
        account2.displayAccountDetails();
        account2.deposit(3000.0);
        account2.withdraw(2000.0);

        System.out.println("Account 3 details:");
        account3.displayAccountDetails();
        account3.deposit(1000.0);
        account3.withdraw(500.0);

    }
}
